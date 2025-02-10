package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

    // metodo para saber si 'x' asiento esta ocupado.
    // hace la comparacion y si el asiento su atributo tipo Usuario es diferente a null significa que el asiento esta ocupado y nos devuelve true
    public static boolean isOcupado(int id, Asientos[] asientos){
        Asientos asientoOcupado = null;

        for (Asientos asiento : asientos) {
            if (asiento.getIdAsiento() == id) {
                asientoOcupado = asiento;
                break;
            }
        }


        if(asientoOcupado.getUser() != null){
            return true;
        }else {
            return false;
        }
    }

    // metodo para saber conocer los datos de quien esta ocupando el asiento 'x'
    // nos imprime los datos del Usuario que esta ocupando tal asiento.
    public static void obtenerUsuario(int id, Asientos[] asientos ){
        Usuarios usuario = null;
        Asientos asientoOcupado = null;
        for (Asientos asiento : asientos) {
            if (asiento.getIdAsiento() == id) {
                asientoOcupado = asiento;
                break;
            }
        }

        if(asientoOcupado != null){
            usuario = asientoOcupado.getUser();
        }else {
            usuario = null;
        }

        if (usuario != null){
            System.out.println("El usuario es: " + usuario.getNombre() + " esta ocupando el asiento");
        }else {
            System.out.println("nadie esta ocupando el asiento");
        }
    }

    // metodo que nos devuelve los asiento que estan al lado de la ventana.
    public static void obtenerAsientosVentana(Asientos[] asientos){
        for (Asientos asiento : asientos){
            if(asiento.getType().equals("Ventana")){
                System.out.println("el asiento No." + asiento.getIdAsiento() + "Esta al lado de la Ventana");
            }
        }
    }

    // metodo que nos devuelve los asientos que estan al lado del pasillo.
    public static void obtenerAsientosPasillo(Asientos[] asientos){
        for (Asientos asiento : asientos){
            if(asiento.getType().equals("Pasillo")){
                System.out.println("el asiento No." + asiento.getIdAsiento() + "Esta al lado del pasillo");
            }
        }
    }

    public static void main(String[] args) {
        // Creando objetos del tipo Usuarios para que acupen los asientos
        Usuarios user1 = new Usuarios("Juan", "Pérez");
        Usuarios user2 = new Usuarios("Ana", "López");
        Usuarios user3 = new Usuarios("Carlos", "Ramírez");
        Usuarios user4 = new Usuarios("Sofía", "Martínez");
        Usuarios user5 = new Usuarios("Luis", "González");

        // inicializacion del Array de Asientos.
        Asientos[] asientos = new Asientos[10];

        // agregando registros al Array de asientos.
        asientos[0] = new Asientos(1, user1, "Ventana");
        asientos[1] = new Asientos(2, null, "Pasillo");
        asientos[2] = new Asientos(3, user2, "Ventana");
        asientos[3] = new Asientos(4, null, "Pasillo");
        asientos[4] = new Asientos(5, user3, "Ventana");
        asientos[5] = new Asientos(6, null, "Pasillo");
        asientos[6] = new Asientos(7, user4, "Ventana");
        asientos[7] = new Asientos(8, null, "Pasillo");
        asientos[8] = new Asientos(9, user5, "Ventana");
        asientos[9] = new Asientos(10, null, "Pasillo");



        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------> Bienvenido al bus <---------------------");
            System.out.println("");

            System.out.println("1. quieres saber si el asiento x esta ocupado?");
            System.out.println("2. datos de la persona que ocupa el asiento");
            System.out.println("3. obtener asientos de la ventana");
            System.out.println("4. obtener asientos del pasillo");
            System.out.println("5. salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que asiento quieres saber si esta ocupado?");
                    if(isOcupado(scanner.nextInt(), asientos)){
                        System.out.println("El asiento esta ocupado!!");
                    }else {
                        System.out.println("el Asiento no esta ocupado");
                    }
                    break;
                    case 2:
                        System.out.println("sobre que asiento quieres saber los datos de la persona que lo ocupa? ");
                        obtenerUsuario(scanner.nextInt(), asientos);
                        break;
                        case 3:
                            obtenerAsientosVentana(asientos);
                            break;
                            case 4:
                                obtenerAsientosPasillo(asientos);
                                break;
                                case 5:
                                    System.out.println("Adios");
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;


            }

        }while (opcion != 5);
    }




}
