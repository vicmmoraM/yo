/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class ActividadFisicaVista {
    private ActividadFisicaControlador controlador;
    private Scanner scanner;

    public ActividadFisicaVista(ActividadFisicaControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    private void ListadoAcF(){
        ArrayList<ActividadFisica> actividades = controlador.getActividadesOrdenadas();

        // Verificar si hay actividades registradas
        if (actividades.isEmpty()) {
            System.out.println("No se han registrado actividades físicas.");
        } else {
            // Mostrar las actividades
            System.out.println("\n--- Listado de Actividades Físicas ---");
            for (ActividadFisica actividad : actividades) {
                System.out.println(actividad); // Llamará al método toString() de ActividadFisica
            }   
        }
    }


    private void registrarActividad(){
        
    }
    public void mostrarMenuActividadFisica(){
        String opcion = "";
        while(!"3".equals(opcion)){
            System.out.println("\n--- Menú de Actividades Fisicas ---");
            System.out.println("1. Listado de Actividades Fisicas");
            System.out.println("2. Registrar Actividad Fisica");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();
            if("1".equals(opcion)){
                ListadoAcF();
            } else if("2".equals(opcion)){

            } else if ("3".equals(opcion)) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
