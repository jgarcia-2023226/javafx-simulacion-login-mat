/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.view;

import com.joaquingarcia.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

/**
 *
 * @author informatica
 */
public class LoginView extends BorderPane {

    public static LoginView instanciaLoginView;
    private HBox barraDeVentana;
    private Label lblTituloVentana;
    private Button btnCerrrarVentana;

    private ImageView imglogologin;
    private TextField txtNombreUsuario;
    private Label lblNombreUsuario;

    private PasswordField pwdClave;
    private Label lblClave;

    private GridPane formulario;
    private Button btnIniciarSesion;
    private VBox cajaVetical;
    
    private ImageView imgLogoLogin;
    
    private final String RUTA_ESTILOS = "/com/joaquingarcia/styles/";
    

    private LoginView() {
        this.getStylesheets().add(RUTA_ESTILOS + "LoginStyles.css");
        
        this.setPadding(new Insets(20));

        this.setBorder(new Border(
                new BorderStroke(Paint.valueOf("#36768F"),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(25),
                        new BorderWidths(15))
        ));

        this.setBackground(new Background(
                new BackgroundFill(Paint.valueOf("#92D4F0"),
                        new CornerRadii(25),
                        Insets.EMPTY
                )
        ));

        barraDeVentana = new HBox(20);

        btnCerrrarVentana = new Button("X");
        lblTituloVentana = new Label("JavaFX - MAT - Simulador Login");

        barraDeVentana.getChildren().addAll(btnCerrrarVentana, lblTituloVentana);

        this.setTop(barraDeVentana);
        
        cajaVetical = new VBox (15);
        
        formulario = new GridPane();
        
        lblNombreUsuario = new Label("Ingrese su Nombre Usuario");
        txtNombreUsuario = new TextField();
        
        lblClave = new Label("Ingrese su contraseña");
        pwdClave = new  PasswordField();
        
        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);
        
        formulario.add(lblClave,0,1);
        formulario.add(pwdClave,1,1);
        
        btnIniciarSesion = new Button("Iniciar Sesion");
        
        imgLogoLogin = new ImageView (new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setCache(true);
        
        cajaVetical.setAlignment(Pos.CENTER);
        
        cajaVetical.getChildren().addAll(
                imgLogoLogin,
                formulario,
                btnIniciarSesion
                );
                
                
        this.setCenter(cajaVetical);
    }

    // GETTERS Y SETTERS
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public HBox getBarraDeVentana() {
        return barraDeVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public Button getBtnCerrrarVentana() {
        return btnCerrrarVentana;
    }

    public void setBarraDeVentana(HBox barraDeVentana) {
        this.barraDeVentana = barraDeVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public void setBtnCerrrarVentana(Button btnCerrrarVentana) {
        this.btnCerrrarVentana = btnCerrrarVentana;
    }

    public ImageView getImglogologin() {
        return imglogologin;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public Label getLblNombreUsuarid() {
        return lblNombreUsuario;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public VBox getCajaVetical() {
        return cajaVetical;
    }

    public void setImglogologin(ImageView imglogologin) {
        this.imglogologin = imglogologin;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public void setLblNombreUsuarid(Label lblNombreUsuarid) {
        this.lblNombreUsuario = lblNombreUsuarid;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public void setCajaVetical(VBox cajaVetical) {
        this.cajaVetical = cajaVetical;
    }
    
    
}   

