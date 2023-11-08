
package com.mycompany.hospital;

import javax.swing.JOptionPane;

public class Medico extends Personal {
   String especialidad;
   String rango;

    public Medico(String nombre, int edad, int idh, String especialidad, String rango) {
        super(nombre, edad, idh);
        this.especialidad = especialidad;
        this.rango = rango;
        
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + ", rango=" + rango + '}';
    }
        public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void IntCons(){
        JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + "años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + "ha entrado a consultorio");
        
    }
    public void DarConsult(){
                JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "de escecialidad" + especialidad + " y de rango" + rango + "esta atendiendo una cita");

    }

}



  
    

   

