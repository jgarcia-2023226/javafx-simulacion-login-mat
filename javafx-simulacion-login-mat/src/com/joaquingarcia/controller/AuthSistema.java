/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.controller;

import com.joaquingarcia.model.Rol;
import com.joaquingarcia.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {

    private static ArrayList<Usuario> listaUsuarios;

    public AuthSistema() {

        listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario(
                "pgarcia",
                "4839",
                "Paola Vianney Hernandez Garcia",
                Rol.ADMIN));

        listaUsuarios.add(new Usuario(
                "jgarcia",
                "2075",
                "Joaquin Gabriel Garcia Jurado",
                Rol.USER));

        listaUsuarios.add(new Usuario(
                "mlopez",
                "4520",
                "Maria Andrea Lopez Mendez",
                Rol.USER));

    }

    public Usuario login(String username, String password) {

        for (Usuario usuario : listaUsuarios) {
            
            if( usuario.getUsername().equals(username)
               && usuario.getPassword().equals(password))
            
            return usuario;
        }
       return null;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
}
