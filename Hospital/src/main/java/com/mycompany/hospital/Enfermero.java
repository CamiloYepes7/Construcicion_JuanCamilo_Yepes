package com.mycompany.hospital;


import com.mycompany.hospital.Personal;
import javax.swing.JOptionPane;


public class Enfermero extends Personal{

        
        private int sector;

    public Enfermero(int sector, String nombre, int edad, int idh) {
        super(nombre, edad, idh);
        this.sector = sector;
    }
   
    public int getsector() {
        return sector;
    }
    
    public void setsector(int sector) {
        this.sector = sector;
    }
        
        public void irsector(){
        String sectorTexto = "";
        switch (sector) {
            case 1:
                sectorTexto = "Sector 1";
                break;
            case 2:
                sectorTexto = "Sector 2";
                break;
            default:
                sectorTexto = "Sector no válido, selecciona 1 o 2";
                break;
        }

   JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "del" + sector + " esta llegando al" + sectorTexto);
        
               }

     public void atender(){
                            JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "del" + sector + " esta atendiendo a un paciente.");
        }
           public void darMedicina(){
                                           JOptionPane.showMessageDialog(null, nombre + idh + " con " + edad + " años de edad" + "del" + sector + " esta dando medicina a un paciente");

           }
    }
    
