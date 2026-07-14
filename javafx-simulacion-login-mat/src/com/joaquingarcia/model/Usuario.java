/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.model;

/**
 *
 * @author informatica
 */
public class Usuario {
    private String username;
    private String password;
    private String nombreCompleto;
    private Rol rol;
    
    //Constructores

    public Usuario(String username, String password, String nombreCompleto, Rol rol) {
        this.username = username;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
    }
    
    public Usuario(){
        
    }
    
    //Getter y Setters
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Rol getRol() {
        return rol;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
 
}
