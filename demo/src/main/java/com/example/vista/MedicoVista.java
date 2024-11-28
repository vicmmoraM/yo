package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;
public class MedicoVista {
    private MedicoControlador controlador;
    private Scanner scanner;

    public MedicoVista(MedicoControlador controlador){
    this.controlador = controlador;
    this.scanner = new Scanner(System.in);
    }

    private void listarMedicos() {
        // Obtener la lista de médicos del controlador
        ArrayList<Medico> medicos = controlador.listarMedicos();
        if (medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
        } else {
            System.out.println("\n--- Listado de Médicos ---");
            for (Medico medico : medicos) {
                System.out.println("Nombre: " + medico.getNombre());
                System.out.println("Especialidad: " + medico.getEspecialidad());
                System.out.println("Teléfono: " + medico.getTelefono());
                System.out.println("Email: " + medico.getEmail());
                System.out.println("Dirección: " + medico.getDireccion());
                System.out.println("----------------------------------");
            }
        }
    }

    private void añadirMedico(){
        System.out.println("\nIngrese el nombre del médico");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especialidad del médico: ");
        String especialidad = scanner.nextLine();
        System.out.print("Ingrese el teléfono del médico: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el email del médico: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese la dirección del médico: ");
        String direccion = scanner.nextLine();

        controlador.agregarMedico(nombre, especialidad, telefono, email, direccion);
    }

    public void MostrarMenuMedico(){
        String opcion;
        do{
            System.out.println("\n--- Menú de Medicos ---");
            System.out.println("1. Listado de Médicos");
            System.out.println("2. Añadir Médico");
            System.out.println("3. Salir");
            System.out.println("");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    listarMedicos();
                    break;
                case "2":
                    añadirMedico();
                    break;
                case "3":
                    System.out.println("Saliendo del menú de medicamentos...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }while(!"3".equals(opcion));
    }
}
