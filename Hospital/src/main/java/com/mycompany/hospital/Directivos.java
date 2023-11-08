package com.mycompany.hospital;


import javax.swing.JOptionPane;


public class Directivos extends Personal {
    String cargo;
    
    public Directivos(String nombre, int edad, int idh, String cargo) {
        super(nombre, edad, idh);
        
       this.cargo=cargo;
      
    }

    @Override
    public String toString() {
        return "Directivos{" + "cargo=" + cargo + '}';
    }

    public String getcargo() {
        return cargo;
    }
        public void setcargo(String cargo) {
        this.cargo = cargo;
        }
        public void dirigir(){
    JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + "años de edad" + " con el cargo de" + cargo +  " dirige el hospital");
        }        
        public void reunion(){
                                JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + " con el cargo de" + cargo + " convocó a una reunión");
        }
}
