package com.example.vista;
import com.example.controlador.*;
import java.util.Scanner;
import com.example.modelo.*;
public class MedicamentoVista {
    private MedicamentoControlador controlador;
    private Scanner scanner;

    public CitaMedicaControlador(MedicamentoControlador controlador){
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }
    
}
