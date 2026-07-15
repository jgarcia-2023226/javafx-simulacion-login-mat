/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaquingarcia.view;

import javafx.scene.layout.VBox;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {
    public static BienvenidaView instanicaBienvenidaView;
    
    public BienvenidaView(){
        
    }

    public static BienvenidaView getInstanicaBienvenidaView() {
        return instanicaBienvenidaView;
    }

    public static void setInstanicaBienvenidaView(BienvenidaView instanicaBienvenidaView) {
        BienvenidaView.instanicaBienvenidaView = instanicaBienvenidaView;
    }
    
    
}
