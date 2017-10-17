/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author spardo
 */
public interface UsuarioDao {    
    public Boolean IniciarSesion(String usuario,String password);    
}
