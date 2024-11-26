/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.modelo;

import java.util.Date;

/**
 *
 * @author Victor
 */
public class ActividadFisica {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private Date fecha; // Fecha en formato dd-MM-yyyy
    private String actividad; // Ahora es un String con valor predeterminado
    private int duracion; // Duración en minutos
    private String horario; // Mañana, Tarde o Noche
    
    public ActividadFisica(Date fecha, String actividad, int duracion) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.duracion = duracion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getHorario() {
        return horario;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Fecha: " + fecha + ", Actividad: " + actividad + ", Duración: " + duracion + " minutos, Horario: " + horario;
    }

}
