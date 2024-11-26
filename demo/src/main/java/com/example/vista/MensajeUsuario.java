package com.example.vista;

public class MensajeUsuario {
    private String titulo;
    private String mensaje;
    
    public MensajeUsuario(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String toString(){
        return titulo + ":" + mensaje;
    }
    

}
