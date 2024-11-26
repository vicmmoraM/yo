package com.example.vista;
import java.util.*;
import com.example.controlador.*;
import com.example.modelo.*;
public class MedicamentoVista {
    private MedicamentoControlador controlador;
    private Scanner scanner;

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("\n--- Menú de Actividad Física ---");
            System.out.println("1. Registrar Actividad");
            System.out.println("2. Listar Actividades");
            System.out.println("3. Salir");
            System.out.println("Seleccion una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if(opcion == 1){
                registrarActividad();
            }
            if(opcion == 2){
                listarActividades();
            }
            if(opcion == 3){
                System.out.println("Saliendo del menú de citas médicas...");
            }




        }
    }
}
