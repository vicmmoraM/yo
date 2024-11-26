package com.example.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.modelo.CitaMedica;

public class CitaMedicaControlador {
    List<CitaMedica> lstCitaMedicas;

    public CitaMedicaControlador(){
        this.lstCitaMedicas = new ArrayList<>();
        ordenarActividadesPorFecha();
    }

    private void ordenarActividadesPorFecha(){
        lstCitaMedicas.sort((a1, a2) -> a2.getFechaHora().compareTo(a1.getFechaHora())); 
    }

    public void agregarCita(String titulo, String doctor, Date fechaHora) {
        lstCitaMedicas.add(new CitaMedica(titulo, doctor, fechaHora));
        System.out.println("Cita médica añadida exitosamente.");
    }
}
