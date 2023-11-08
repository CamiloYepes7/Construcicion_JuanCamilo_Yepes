package com.mycompany.hospital;


import javax.swing.JOptionPane;


public class Paramedico extends Medico {

    public Paramedico(String nombre, int edad, int idh, String especialidad, String rango) {
        super(nombre, edad, idh, especialidad, rango);
    }
    
    public void moverse(){
                              JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango +" se esta moviendo en una ambulancia");
    }
    public void atender(){
                              JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + " atiende al paciente en la ambulncia");
    }
    public void registrar (){
                      JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + " esta registrando los datos del paciente");
    }
}