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

    public void mostrarOpciones(){
        Scanner sc = new Scanner(System.in);

        while (true) { // Bucle infinito
            System.out.println("Opciones:");
            System.out.println("a. Crear perfil");
            System.out.println("b. Seleccionar perfil");
            System.out.println("c. Salir");
            System.out.print("Ingrese una opción: ");
            String opcion = sc.nextLine().toLowerCase();

            if ("a".equals(opcion)) {
                crearPerfil();
            } else if ("b".equals(opcion)) {
                seleccionarPerfil();
            } else if ("c".equals(opcion)) {
                System.out.println("Saliendo...");
                return; // Termina el método y, por ende, el bucle
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

    }

    private void crearPerfil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la relación: ");
        String relacion = scanner.nextLine();
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();

        MensajeUsuario resultado = controlador.agregarPerfil(nombre, relacion, email);
        if (resultado == null) {
            System.out.println("Perfil creado exitosamente.");
        } else {
            System.out.println(resultado.getMensaje());
        }
    }

    private void seleccionarPerfil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del perfil: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        Perfil perfil = controlador.seleccionarPerfil(codigo);
        if (perfil != null) {
            System.out.println("Perfil seleccionado:");
            System.out.println(perfil.toString());
        } else {
            System.out.println("Perfil no encontrado.");
        }
    }
}
