/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controlador;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Victor
 */

import com.example.modelo.ActividadFisica;
public class ActividadFisicaControlador {
    private List<ActividadFisica> lstacActividadFisicas;

    public ActividadFisicaControlador(){
        this.lstacActividadFisicas = new ArrayList<>(); //Inicializar lista

        ordenarActividadesPorFecha();
    }

    public void agregarActividad(ActividadFisica af){
        lstacActividadFisicas.add(af);
    }

    private void ordenarActividadesPorFecha(){
        lstacActividadFisicas.sort((a1, a2) -> a2.getFecha().compareTo(a1.getFecha())); 
    }

    public List<ActividadFisica> getActividadesOrdenadas() {
        return lstacActividadFisicas;
    }
}
