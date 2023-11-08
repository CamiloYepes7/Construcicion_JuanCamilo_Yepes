package com.mycompany.hospital;


import com.mycompany.hospital.Personal;
import javax.swing.JOptionPane;


public class Recepcionista extends Personal{

    public Recepcionista(String nombre, int edad, int idh) {
        super(nombre, edad, idh);
    }
    public void contestar(){
                                    JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + " contesta una llamada");

    }
    public void informar(){
                            JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + " esta dasndo informacion a los usuarios");
    }
    public void asignarCita(){
                                    JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + "años  de edad" + " esta asignando una cita");
    }
    
}
