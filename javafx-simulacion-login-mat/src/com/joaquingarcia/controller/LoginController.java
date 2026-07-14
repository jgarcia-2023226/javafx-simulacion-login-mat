/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.controller;

import com.joaquingarcia.view.LoginView;

/**
 *
 * @author informatica
 */
public class LoginController {
    private final LoginView LOGIN_VIEW;
    
    public LoginController(LoginView loginView){
        this.LOGIN_VIEW = loginView;
       construirAcciones();
    }
    
    public void construirAcciones(){
        this.LOGIN_VIEW.getBtnCerrrarVentana().setOnMouseClicked(
                (evento)->{
                    System.exit(0);
                }
        );
    }
}
