package com.example;

import com.example.controlador.ControladorPerfil;
import com.example.vista.VistaPerfil;

public class Main {
    public static void main(String[] args) {
        ControladorPerfil controlador = new ControladorPerfil();
        VistaPerfil vista = new VistaPerfil(controlador);
        vista.mostrarListaPerfiles();
        vista.mostrarOpciones();
    }
}