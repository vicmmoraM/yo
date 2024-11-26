package com.example.modelo;

import java.util.Date;

/**
 *
 * @author Victor
 */
public class CitaMedica{
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String titulo; // Título de la cita
    private String doctor; // Nombre del doctor
    private Date fechaHora; // Fecha y hora en formato adecuado

    // Constructor
    public CitaMedica(String titulo, String doctor, Date fechaHora) {
        this.id = ++contador;
        this.titulo = titulo;
        this.doctor = doctor;
        this.fechaHora = fechaHora;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDoctor() {
        return doctor;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Doctor: " + doctor + ", Fecha y Hora: " + fechaHora;
    }
}