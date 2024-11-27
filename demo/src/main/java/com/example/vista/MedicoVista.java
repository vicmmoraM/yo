package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;
import java.util.Scanner;
public class MedicoVista {
    private MedicamentoControlador controlador;
    private Scanner scanner;

    public MedicoVista(MedicamentoControlador controlador){
    this.controlador = controlador;
    this.scanner = new Scanner(System.in);
    }

}
