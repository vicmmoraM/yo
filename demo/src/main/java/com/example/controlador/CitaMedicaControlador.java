package com.example.controlador;

import java.util.ArrayList;

import com.example.modelo.CitaMedica;

public class CitaMedicaControlador {
    private ArrayList<CitaMedica> lstCitaMedicas;

    public CitaMedicaControlador(){
        this.lstCitaMedicas = new ArrayList<>();
        ordenarActividadesPorFecha();
    }

    private void ordenarActividadesPorFecha(){
        lstCitaMedicas.sort((a1, a2) -> a2.getFechaHora().compareTo(a1.getFechaHora())); 
    }

    public void agregarCita(String titulo, String doctor, String fechaHora) {
        lstCitaMedicas.add(new CitaMedica(titulo, doctor, fechaHora));
        System.out.println("Cita médica añadida exitosamente.");
    }

    public ArrayList<CitaMedica> getCitaMedicas(){
        return lstCitaMedicas;
    }
}
