/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controlador;
import java.util.*;
/**
 *
 * @author Victor
 */

import com.example.modelo.ActividadFisica;
public class ActividadFisicaControlador {
    private ArrayList<ActividadFisica> lstacActividadFisicas;

    public ActividadFisicaControlador(){
        lstacActividadFisicas = new ArrayList<>(); //Inicializar lista

        ordenarActividadesPorFecha();
    }

    public void agregarActividad(ActividadFisica af){
        lstacActividadFisicas.add(af);
    }

    private void ordenarActividadesPorFecha(){
        lstacActividadFisicas.sort((a1, a2) -> a2.getFecha().compareTo(a1.getFecha())); 
    }

    public ArrayList<ActividadFisica> getActividadesOrdenadas() {
        return lstacActividadFisicas;
    }
}
