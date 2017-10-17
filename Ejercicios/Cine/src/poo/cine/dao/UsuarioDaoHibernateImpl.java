/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.Usuario;

/**
 *
 * @author spardo
 */
public class UsuarioDaoHibernateImpl implements UsuarioDao{

    private final SessionFactory sessionFactory;
    
    public UsuarioDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public Boolean IniciarSesion(String usuario, String password) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);
        Root<Usuario> root = query.from(Usuario.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre_usuario"), usuario));
        query.where(builder.equal(root.get("contrasenia"), password));
        
        Usuario dbUser = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return dbUser != null;
    }
    
}
