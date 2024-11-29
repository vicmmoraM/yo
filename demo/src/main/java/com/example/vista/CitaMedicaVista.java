package com.example.vista;

import com.example.controlador.*;
import com.example.modelo.CitaMedica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class CitaMedicaVista {
    private CitaMedicaControlador controlador;
    private Scanner scanner;
    public CitaMedicaVista(CitaMedicaControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    private void listarCitas() {
        System.out.println("\n--- Listado de Citas Médicas ---");
        if (controlador.getCitaMedicas().isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (CitaMedica cita : controlador.getCitaMedicas()) {
                System.out.println(cita);
            }
        }
    }


    public void MostrarMenuCitas(){
        String opcion = "";
        while (!"3".equals(opcion)) {
            System.out.println("\n--- Menú de Citas Médicas ---");
            System.out.println("1. Listado de Citas");
            System.out.println("2. Agregar Cita");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            if ("1".equals(opcion)) {
                listarCitas();
            } else if ("2".equals(opcion)) {
                // Método agregar
            
            } else if ("3".equals(opcion)) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
