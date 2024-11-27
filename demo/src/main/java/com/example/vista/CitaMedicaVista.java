package com.example.vista;

import com.example.controlador.*;
import java.util.Scanner;
public class CitaMedicaVista {
    private CitaMedicaControlador controlador;
    private Scanner scanner;
    public CitaMedicaVista(CitaMedicaControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    
}
