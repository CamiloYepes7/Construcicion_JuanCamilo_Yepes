package com.mycompany.hospital;


import javax.swing.JOptionPane;


public class Personal {
    
   String nombre;
    int edad;
   int idh;

    
    
public Personal(String nombre, int edad, int idh){
    this.nombre = nombre;
    this.edad=edad;
    this.idh=idh;
}
public void llegar(){
    JOptionPane.showMessageDialog(null, "ha llegado al hospital");
 
}
public void salir(){
    JOptionPane.showMessageDialog(null, "ha salido del hospital");
}
      public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdh() {
        return idh;
    }
  public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdh(int idh) {
        this.idh = idh;
    }


}
    
