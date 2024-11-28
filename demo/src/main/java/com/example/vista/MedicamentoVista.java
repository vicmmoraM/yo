package com.example.vista;
import com.example.controlador.*;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.modelo.*;
public class MedicamentoVista {
    private MedicamentoControlador controlador;
    private Scanner scanner;

    public MedicamentoVista(MedicamentoControlador controlador){
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }
    
    private void listarMedicamentos() {
        ArrayList<Medicamento> medicamentos = controlador.listarMedicamentos();
        if (medicamentos.isEmpty()) {
            System.out.println("No hay medicamentos registrados.");
        } else {
            System.out.println("********** Medicamentos **********");
            for (Medicamento medicamento : medicamentos) {
                System.out.println(medicamento);
            }
        }
    }

    private void añadirMedicamento() {
        System.out.println("\n--- Añadir Medicamento ---");
        System.out.print("Ingrese el nombre del medicamento: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Seleccione la presentación (Pastilla, Inyección, Solución, Gotas, Inhalador, Polvo): ");
        String presentacion = scanner.nextLine();
        System.out.print("Indique la frecuencia: ");
        String frecuencia = scanner.nextLine();
        System.out.print("Ingrese la dosis por toma: ");
        int dosis = Integer.parseInt(scanner.nextLine());
        // Aquí debes agregar la lógica para manejar las horas de toma y la frecuencia por día

        controlador.agregarMedicamento(nombre, presentacion, cantidad, frecuencia, new ArrayList<>(), dosis);
    }

    private void eliminarMedicamento() {
        listarMedicamentos();
        System.out.print("\nIngrese el ID del medicamento que desea eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean eliminado = controlador.eliminarMedicamento(id);
        if (eliminado) {
            System.out.println("Medicamento eliminado exitosamente.");
        } else {
            System.out.println("No se encontró un medicamento con ese ID.");
        }
    }

    private void registrarToma() {
        listarMedicamentos();
        System.out.print("\nIngrese el ID del medicamento que desea registrar la toma: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la cantidad tomada: ");
        int cantidadTomada = Integer.parseInt(scanner.nextLine());
        boolean registrado = controlador.registrarToma(id, cantidadTomada);
        if (registrado) {
            System.out.println("Toma registrada exitosamente.");
        } else {
            System.out.println("Error al registrar la toma.");
        }
    }

    public void mostrarMenuMedicamentos() {
        String opcion;
        do {
            System.out.println("\n--- Menú de Medicamentos ---");
            System.out.println("1. Listar Medicamentos");
            System.out.println("2. Añadir Medicamento");
            System.out.println("3. Eliminar Medicamento");
            System.out.println("4. Registrar Toma de Medicamento");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    listarMedicamentos();
                    break;
                case "2":
                    añadirMedicamento();
                    break;
                case "3":
                    eliminarMedicamento();
                    break;
                case "4":
                    registrarToma();
                    break;
                case "5":
                    System.out.println("Saliendo del menú de medicamentos...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (!"5".equals(opcion));
    }
}
