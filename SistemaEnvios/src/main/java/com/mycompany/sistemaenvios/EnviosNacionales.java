/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaenvios;

/**
 *
 * @author camil
 */
public class EnviosNacionales extends Envios {
    private String direccionDestino;

    public EnviosNacionales(String producto, double precio, String direccionDestino) {
        super(producto, precio);
        this.direccionDestino = direccionDestino;
        
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }
     @Override
    public void hacerEnvio() {
        System.out.println("Envío nacional realizado para el producto: " + getproducto() + " a la dirección: " + direccionDestino);
}
}