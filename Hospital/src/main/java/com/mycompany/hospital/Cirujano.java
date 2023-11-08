package com.mycompany.hospital;


import javax.swing.JOptionPane;


public class Cirujano extends Medico{

    public Cirujano(String nombre, int edad, int idh, String especialidad, String rango) {
        super(nombre, edad, idh, especialidad, rango);
    }
        public void irquirofano (){
         JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + " va al quirofano");
}
        public void cirujia(){
                     JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango +" esta haciendo cirujia");

            
        }
}

