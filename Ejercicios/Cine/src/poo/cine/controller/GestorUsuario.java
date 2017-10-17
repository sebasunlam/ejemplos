/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import org.hibernate.SessionFactory;
import poo.cine.dao.UsuarioDao;
import poo.cine.dao.UsuarioDaoHibernateImpl;
import poo.cine.ui.Login;

/**
 *
 * @author spardo
 */
public class GestorUsuario {
    
    private final UsuarioDao usuarioDao;
    private final Login panel;
    public GestorUsuario(SessionFactory sessionFactory){
        
        this.panel = new Login(this);
        this.usuarioDao = new UsuarioDaoHibernateImpl(sessionFactory);
        
    }
    
    public Boolean IniciarSesion(String usuario,String password){
        return this.usuarioDao.IniciarSesion(usuario, password);                
    }
    
    public void run(){        
        panel.setVisible(true);
    }
    
    public void close(){
        panel.setVisible(false);
    }
    
}
