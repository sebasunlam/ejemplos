/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miobjeto;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class Persona {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String sexo;
    private String domicilio;
    private Integer codigoPostal;
    private Integer telefonoCelular;
    private Integer telefonoParticular;
    
    public Integer getDni (){
        return dni;
    }

    public void  setDni (Integer dni){
        
        this.dni=dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the codigoPostal
     */
    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the telefonoCelular
     */
    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * @param telefonoCelular the telefonoCelular to set
     */
    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    /**
     * @return the telefonoParticular
     */
    public Integer getTelefonoParticular() {
        return telefonoParticular;
    }

    /**
     * @param telefonoParticular the telefonoParticular to set
     */
    public void setTelefonoParticular(Integer telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }
    

    
} 