/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    private String mostrarMenuActividad(){
        String actividad = "";
        String opcion = "";
        while ((actividad.equals(""))) {
            System.out.println("Seleccione la actividad física realizada:");
            System.out.println("1. Caminar");
            System.out.println("2. Trotar");
            System.out.println("3. Correr");
            System.out.println("4. Funcional");
            System.out.println("5. Crossfit");
            System.out.println("6. Entrenamiento de pesas");
            System.out.println("7. Nadar");
            System.out.print("Ingrese el número de la actividad: ");

            opcion = scanner.nextLine();

            if("1".equals(opcion)){
                actividad = "Caminar";
            } else if("2".equals(opcion)){
                actividad = "Trotar";
            } else if("3".equals(opcion)){
                actividad = "Correr";
            } else if("4".equals(opcion)){
                actividad = "Funcional";
            } else if("5".equals(opcion)){
                actividad = "Crossfit";
            } else if("6".equals(opcion)){
                actividad = "Entrenamiento de pesas";
            } else if("7".equals(opcion)){
                actividad = "Nadar";
            } else{
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        return actividad; 
    }

    private String seleccionarHorario() {
        String horario = "";  // Inicia la variable vacía
        while (horario.equals("")) {  // Condición que comprueba si el horario está vacío
            System.out.println("Seleccione el horario de la actividad:");
            System.out.println("1. Mañana");
            System.out.println("2. Tarde");
            System.out.println("3. Noche");
            System.out.print("Ingrese el número del horario: ");
            String opcionHorario = scanner.nextLine();

            // Usando if-else para manejar la selección del horario
            if (opcionHorario.equals("1")) {
                horario = "Mañana";
            } else if (opcionHorario.equals("2")) {
                horario = "Tarde";
            } else if (opcionHorario.equals("3")) {
                horario = "Noche";
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        return horario; // Devuelve el horario seleccionado
    }

    private void registrarActividad(){
        System.out.println("\n--- Registrar Actividad Física ---");

        String fechaInput = "";
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.print("Ingrese la fecha de la actividad (dd-MM-yyyy): ");
            fechaInput = scanner.nextLine();
            if (validarFecha(fechaInput)) {
                fechaValida = true;
            } else {
                System.out.println("La fecha ingresada no es válida o es una fecha futura. Intente nuevamente.");
            }
        }

        String actividad = mostrarMenuActividad();  

        String horario = seleccionarHorario();  

        System.out.print("Ingrese la duración de la actividad en minutos: ");
        int duracion = Integer.parseInt(scanner.nextLine());

        ActividadFisica actividadFisica = new ActividadFisica(fechaInput, actividad, duracion, horario);
        controlador.agregarActividad(actividadFisica);
        System.out.println("Actividad registrada exitosamente: " + actividadFisica);
    }

    private boolean validarFecha(String fechaInput) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        formatoFecha.setLenient(false);  

        // Verificar si el formato es válido
        Date fecha = null;
        String[] fechaPartes = fechaInput.split("-");
        if (fechaPartes.length == 3) {
            int dia = Integer.parseInt(fechaPartes[0]);
            int mes = Integer.parseInt(fechaPartes[1]) - 1; 
            int anio = Integer.parseInt(fechaPartes[2]);

            // Comprobamos si la fecha es válida
            if (mes >= 0 && mes <= 11 && dia > 0) {
                Date fechaLimite = new Date();
                fecha = new Date(anio - 1900, mes, dia);

                // Verificar si la fecha no es futura
                if (fecha.before(fechaLimite) || fecha.equals(fechaLimite)) {
                    return true;
                }
            }
        }

        return false; // Si no es válida
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
                registrarActividad();
            } else if ("3".equals(opcion)) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
