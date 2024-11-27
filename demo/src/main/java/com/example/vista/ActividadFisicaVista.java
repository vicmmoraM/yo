/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;
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

    public void mostrarMenu(){
        int opcion;
        do{
            System.out.println("\n--- Menú de Actividad Física ---");
            System.out.println("1. Registrar Actividad");
            System.out.println("2. Listar Actividades");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            if(opcion == 1){
                //registrarActividad();
            }
            else if (opcion == 2){
                controlador.getActividadesOrdenadas();
            }
            else if (opcion == 3){
                System.out.println("Saliendo del menú de actividad física...");
            } 
            else{
                System.out.println("Opción no válida, intente nuevamente");
            }
            } while(opcion != 3);
    }
}
