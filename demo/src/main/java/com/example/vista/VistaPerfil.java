package com.example.vista;
import com.example.controlador.*;
import com.example.modelo.*;
import java.util.*;
public class VistaPerfil {
    ControladorPerfil controlador = new ControladorPerfil();

    public VistaPerfil(ControladorPerfil controlador){
        this.controlador = controlador;
    }

    public void mostrarListaPerfiles(){
        ArrayList<Perfil> perfiles = controlador.getListaPerfiles();
        if(perfiles.isEmpty()){
            System.out.println("No hay perfiles disponibles");
        }else{
            System.out.println("**********Perfiles**********");
            for (Perfil perfil : perfiles) {
                System.out.println(perfil);
            }
        }
    }
}
