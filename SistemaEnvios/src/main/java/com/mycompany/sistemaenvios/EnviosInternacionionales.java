/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaenvios;

/**
 *
 * @author camil
 */
public class EnviosInternacionionales extends Envios {
    private String paisDestino;

    public EnviosInternacionionales(String paisDestino, String producto, double precio) {
        super(producto, precio);
        this.paisDestino = paisDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

 @Override
    public void hacerEnvio() {
        System.out.println("Envío internacional realizado para el modelo: " + getproducto() + " al país: " + paisDestino);
    }
}


