/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.view;

import com.joaquingarcia.model.Usuario;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {
    

    private Label lblMensaje;
    private Label lblRol;
    private Button btnSalir;

    public BienvenidaView(Usuario usuario) {

        this.setSpacing(20);
        this.setPadding(new Insets(30));
        this.setAlignment(Pos.CENTER);

        this.setBackground(new Background(new BackgroundFill(
                Paint.valueOf("#118C7F"),
                new CornerRadii(20),
                Insets.EMPTY
        )));

        lblMensaje = new Label("¡Bienvenido, " + usuario.getNombreCompleto() + "!");
        lblMensaje.setFont(Font.font("System", FontWeight.BOLD, 18));
        lblMensaje.setTextFill(Paint.valueOf("#FFFFFF"));

        lblRol = new Label("Rol asignado: " + usuario.getRol().toString());
        lblRol.setFont(Font.font("System", FontWeight.NORMAL, 14));
        lblRol.setTextFill(Paint.valueOf("#E3DD09"));

        btnSalir = new Button("Cerrar Sesión");
        btnSalir.setStyle("-fx-background-color: #8E27F5; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;");
        btnSalir.setPrefWidth(120);
        btnSalir.setPrefHeight(35);

        btnSalir.setOnMouseClicked(e -> System.exit(0));

        btnSalir.setOnMouseEntered(e ->
            btnSalir.setStyle("-fx-background-color: #a04ef7; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;")
        );

        btnSalir.setOnMouseExited(e ->
            btnSalir.setStyle("-fx-background-color: #8E27F5; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;")
        );

        this.getChildren().addAll(lblMensaje, lblRol, btnSalir);
    }

}

