/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaenvios;

/**
 *
 * @author camil
 */
public class Envios {
    String producto;
    private double precio;

    public Envios(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getproducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setproducto(String modelo) {
        this.producto = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void hacerPedido() {
        System.out.println("Pedido realizado para el producto: " + producto);
    }

    public void realizarPago() {
        System.out.println("Pago realizado por el producto: " + producto + " con precio: " + precio);
    }

    public void hacerEnvio() {
        System.out.println("Envío realizado para el producto: " + producto);
    }
}


