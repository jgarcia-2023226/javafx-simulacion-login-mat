/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.controller;

import com.joaquingarcia.model.Usuario;
import com.joaquingarcia.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;
    private double ejeX = 0;
    private double ejeY = 0;
    private Stage escenario = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();
    private final AuthSistema AUTH_SISTEMA;

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        this.AUTH_SISTEMA = new AuthSistema();
        construirAcciones();
    }

    public void construirAcciones() {
        this.LOGIN_VIEW.getBtnCerrrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );

        this.LOGIN_VIEW.setOnMouseClicked(
                (evento) -> {
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();
                }
        );

        this.LOGIN_VIEW.setOnMouseDragged(
                (evento) -> {
                    double ejeXVentanaDesplazamiento = evento.getScreenX();
                    double ejeYVentanaDesplazamiento = evento.getScreenY();

                    System.out.println("Desplazamiento total X " + (ejeXVentanaDesplazamiento - ejeX));
                    System.out.println("Desplazamiento total Y " + (ejeYVentanaDesplazamiento - ejeY));

                    escenario.setX(ejeXVentanaDesplazamiento - ejeX);
                    escenario.setY(ejeYVentanaDesplazamiento - ejeY);
                }
        );

        this.LOGIN_VIEW.getBtnIniciarSesion().setOnAction(evento -> {

            validarLogin();

        });

    }

    private void validarLogin() {

        String usuario = LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String password = LOGIN_VIEW.getPwdClave().getText().trim();

        if (usuario.isEmpty() || password.isEmpty()) {

            if (usuario.isEmpty()) {
                this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
                JOptionPane.showMessageDialog(null,
                        "NO DEJE EL CAMPO NOMBRE USUARIO VACIO");

            } else if (password.isEmpty()) {
                this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("error");
                this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
                this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
                this.LOGIN_VIEW.getPwdClave().getStyleClass().add("error");
                JOptionPane.showMessageDialog(null,
                        "NO DEJE EL CAMPO CONTRASEÑA VACIO");
            };

            return;
        }

        Usuario usuarioLogin = AUTH_SISTEMA.login(usuario, password);

        if (usuarioLogin != null) {

            SceneManager.getInstanciaSceneManager().ventanaBienvenida(usuarioLogin);

        } else {

            JOptionPane.showMessageDialog(null, "Verifique que sus datos esten bien colocados");
        }

    }
}
