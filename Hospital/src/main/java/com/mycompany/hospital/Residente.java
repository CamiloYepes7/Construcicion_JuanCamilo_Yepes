package com.mycompany.hospital;


import javax.swing.JOptionPane;


public class Residente extends Medico{

    public Residente(String nombre, int edad, int idh, String especialidad, String rango) {
        super(nombre, edad, idh, especialidad, rango);
    }
  public void apoyar(){

        JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + " esta apoyando al medico");
  }
  public void procedimiento(){
              JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + " esta haciendo un procedimiento medico");

  }
}

