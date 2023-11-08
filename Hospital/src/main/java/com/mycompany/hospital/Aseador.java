package com.mycompany.hospital;


import com.mycompany.hospital.Personal;
import javax.swing.JOptionPane;


public class Aseador extends Personal{

    public Aseador(String nombre, int edad, int idh) {
        super(nombre, edad, idh);
    }
public void desinfectar(){
                                JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años  de edad" + " esta desinfectando el hostpital");
}
public void limpiar(){
                                    JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " añosde edad" +"esta desinfectando el hostpital");

}
}
