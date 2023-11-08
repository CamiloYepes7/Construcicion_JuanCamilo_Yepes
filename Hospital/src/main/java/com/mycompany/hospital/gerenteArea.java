package com.mycompany.hospital;


import com.mycompany.hospital.Personal;
import javax.swing.JOptionPane;


public class gerenteArea extends Personal{

    /**1= area de medicina.
     * 2= area de enfermeria
     * 3. area de recursos humanos
     * 4= area de economia y administrativa
     */
    
    int area;

    public gerenteArea(String nombre, int edad, int idh) {
        super(nombre, edad, idh);
    }

    @Override
    public String toString() {
        return "gerenteArea{" + "area=" + area + '}';
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
  public void manejarArea() {
        String areaTexto = "";
        switch (area) {
            case 1:
                areaTexto = "Medicina";
                break;
            case 2:
                areaTexto = "Enfermería";
                break;
            case 3:
                areaTexto = "Recursos Humanos";
                break;
            case 4:
                areaTexto = "Economía y Administrativa";
                break;
            default:
                areaTexto = "Área no válida.";
                break;
        }
      JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + "años de edad" + "del area de" + area + " esta manejando el area de" + areaTexto);

     
    }
}
 
