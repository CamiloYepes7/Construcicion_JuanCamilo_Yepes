
package com.mycompany.hospital;

import javax.swing.JOptionPane;


public class Hospital {

    public static void main(String[] args) {
     
      String nombreDirector = JOptionPane.showInputDialog("Ingrese el nombre del Director:");
        int edadDirector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Director:"));
        int idhDirector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Director:"));
        String cargoDirector = JOptionPane.showInputDialog("Ingrese el cargo del Director:");

        Directivos director = new Directivos(nombreDirector, edadDirector, idhDirector, cargoDirector);
        
        director.dirigir();
        director.reunion();

        
        String nombreGerente = JOptionPane.showInputDialog("Ingrese el nombre del Gerente de Área:");
        int edadGerente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Gerente de Área:"));
        int idhGerente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Gerente de Área:"));

        gerenteArea gerente = new gerenteArea(nombreGerente, edadGerente, idhGerente);
        

int area = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de área:\n" +
                "1 = Medicina\n" +
                "2 = Enfermería\n" +
                "3 = Recursos Humanos\n" +
                "4 = Economía y Administrativa"));

  
        gerente.setArea(area);
        gerente.manejarArea();

String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del Médico:");
        int edadMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Médico:"));
        int idhMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Médico:"));
        String especialidadMedico = JOptionPane.showInputDialog("Ingrese la especialidad del Médico:");
        String rangoMedico = JOptionPane.showInputDialog("Ingrese el rango del Médico:");

        Medico medico = new Medico(nombreMedico, edadMedico, idhMedico, especialidadMedico, rangoMedico);
        
        medico.IntCons();
        medico.DarConsult();

  
        String nombreCirujano = JOptionPane.showInputDialog("Ingrese el nombre del Cirujano:");
        int edadCirujano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Cirujano:"));
        int idhCirujano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Cirujano:"));
        String especialidadCirujano = JOptionPane.showInputDialog("Ingrese la especialidad del Cirujano:");
        String rangoCirujano = JOptionPane.showInputDialog("Ingrese el rango del Cirujano:");

        Cirujano cirujano = new Cirujano(nombreCirujano, edadCirujano, idhCirujano, especialidadCirujano, rangoCirujano);
        
        cirujano.irquirofano();
        cirujano.cirujia();


        String nombreResidente = JOptionPane.showInputDialog("Ingrese el nombre del Residente:");
        int edadResidente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Residente:"));
        int idhResidente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Residente:"));
        String especialidadResidente = JOptionPane.showInputDialog("Ingrese la especialidad del Residente:");
        String rangoResidente = JOptionPane.showInputDialog("Ingrese el rango del Residente:");

        Residente residente = new Residente(nombreResidente, edadResidente, idhResidente, especialidadResidente, rangoResidente);

            
        residente.apoyar();
        residente.procedimiento();
   
        String nombreParamedico = JOptionPane.showInputDialog("Ingrese el nombre del Paramédico:");
        int edadParamedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Paramédico:"));
        int idhParamedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Paramédico:"));
        String especialidadParamedico = JOptionPane.showInputDialog("Ingrese la especialidad del Paramédico:");
        String rangoParamedico = JOptionPane.showInputDialog("Ingrese el rango del Paramédico:");

        Paramedico paramedico = new Paramedico(nombreParamedico, edadParamedico, idhParamedico, especialidadParamedico, rangoParamedico);

                paramedico.moverse();
        paramedico.atender();
        paramedico.registrar();
  
   
        String nombreEnfermero = JOptionPane.showInputDialog("Ingrese el nombre del Enfermero:");
        int edadEnfermero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Enfermero:"));
        int idhEnfermero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Enfermero:"));
        int sectorEnfermero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sector:\n" +
                "1 = Sector 1\n" +
                "2 = Sector 2"));

        Enfermero enfermero = new Enfermero(sectorEnfermero, nombreEnfermero, edadEnfermero, idhEnfermero);

               enfermero.irsector();
        enfermero.atender();
        enfermero.darMedicina();

        String nombreRecepcionista = JOptionPane.showInputDialog("Ingrese el nombre del Recepcionista:");
        int edadRecepcionista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Recepcionista:"));
        int idhRecepcionista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Recepcionista:"));

        Recepcionista recepcionista = new Recepcionista(nombreRecepcionista, edadRecepcionista, idhRecepcionista);
        
                

        recepcionista.contestar();
        recepcionista.informar();
        recepcionista.asignarCita();


        String nombreAseador = JOptionPane.showInputDialog("Ingrese el nombre del Aseador:");
        int edadAseador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Aseador:"));
        int idhAseador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el IDH del Aseador:"));

        Aseador aseador = new Aseador(nombreAseador, edadAseador, idhAseador);

        aseador.desinfectar();
        aseador.limpiar();

        
        

                }
}
