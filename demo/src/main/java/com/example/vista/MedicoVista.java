package com.example.vista;
import java.util.*;
import com.example.controlador.*;
import com.example.modelo.*;
public class MedicoVista {
    private MedicoControlador controlador;
    private Scanner scanner;

    public MedicoVista(MedicoControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
        
    }

}
