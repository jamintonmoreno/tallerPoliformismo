package com.canteraSofka;

/**
 * Se importa libreria necesaria para capturar valores ingresados por teclado.
 */
import java.util.Scanner;

/**
 * Clase principal para ejecutar el programa.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Se crean variables en las cuáles se guardarán los valores
         * ingresados por teclado.
         */
        Scanner sn = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);

        /**
         * Se inicializa la variable que permitirá finalizar el programa.
         */
        boolean salir = false;

        /**
         * Se crea variable en la cuál se guardará la opción ingresada por
         * el usuario a través del teclado.
         */
        int opcion;

        /**
         * Se crea variable en la cuál se guardará el nombre de la nave que
         * el usuario ingresé a través del teclado.
         */
        String nameNaveUser;

        /**
         * Ciclo de control que permitirá ejecutar el programa hasta recibir
         * que el usuario desee.
         */
        while (!salir){

            /**
             * Instrucciones para el usuario sobre el uso del programa.
             */
            System.out.println("------------Bienvenido-----------");
            System.out.println("""
                 Señor usuario digíte la opción\s
                correspondiente a la nave espacial
                       que desea construir
                """);

            System.out.println("   1. Nave Espacial Lanzadera");
            System.out.println("   2. Nave Espacial Tripulada");
            System.out.println("   3. Nave Espacial No Tripulada");
            System.out.println("   4. Nave Estación Espacial International");
            System.out.println("   5. Salir"+"\n");

            /**
             * Función para capturar el error que pueda generar el usuario
             * durante la selección de las opciones.
             */
            try {
                System.out.println("Digíte su opción: ");
                opcion = sn.nextInt();

                /**
                 * Función de control que permite la ejecución del programa
                 * según las opciones ingresadas por el usuario.
                 */
                switch (opcion) {
                    case 1 -> {
                        NaveLanzadera nave1 = new NaveSaturno("Saturno");
                        System.out.println("Ingrese el nombre que desea ponerle a su Nave: ");
                        nameNaveUser = sm.next();
                        System.out.println("\n"+ "--- Información de la nave seleccionada ---");
                        System.out.println("Nombre: " + (nave1.nameNave = nameNaveUser));
                        System.out.println("Capacidad de carga: "+ nave1.loadCapacity+" Toneladas");
                        System.out.println("Peso: "+ nave1.pesoNave() +" Kilogramos");
                        System.out.println("Tipo de combustible: "+ nave1.typeFuel);
                        System.out.println("Potencia: "+ nave1.power+" Hp");
                        System.out.println("--------------------------------------------\n");
                    }
                    case 2 -> {
                        NaveTripulate nave1 = new NaveApolo("Apolo");
                        System.out.println("Ingrese nombre que desea ponerle a su Nave: ");
                        nameNaveUser = sm.next();
                        System.out.println("\n" + "--- Información de la nave seleccionada ---");
                        System.out.println("Nombre: " + (nave1.nameNave = nameNaveUser));
                        System.out.println("Uso de la nave: " + nave1.used);
                        System.out.println("Peso: " + nave1.weight + " Toneladas");
                        System.out.println("Capacidad de Tripulantes: " + nave1.crewSize);
                        System.out.println("Distancia de operación: " + nave1.altitudeOrbit() + " Kilómetros");
                        System.out.println("---------------------------------------------\n");
                    }
                    case 3 -> {
                        NaveNoTripulate nave1 = new NaveMarte("Marte");
                        System.out.println("Ingrese nombre que desea ponerle a su Nave: ");
                        nameNaveUser = sm.next();
                        System.out.println("\n" + "--- Información de la nave seleccionada ---");
                        System.out.println("Nombre: " + (nave1.nameNave = nameNaveUser));
                        System.out.println("Tipo de combustible: " + nave1.typeFuel);
                        System.out.println("Empuje: " + nave1.thrust + " Kilogramos");
                        System.out.println("Distancia de Viaje: " + nave1.travelScope() + " Kilómetros");
                        System.out.println("---------------------------------------------\n");
                    }
                    case 4 -> {
                        NaveTripulate nave2 = new StationSpaceInternational("Estación Espacial Internacional");
                        System.out.println("\n" + "--- Información de la nave seleccionada ---");
                        System.out.println("Nombre: " + nave2.nameNave);
                        System.out.println("Peso: " + nave2.weight + " kilogramos");
                        System.out.println("Uso de la nave: " + nave2.used);
                        System.out.println("Capacidad de Tripulantes: " + nave2.crewSize);
                        System.out.println("Distancia de Operación: " + nave2.scope + " km");
                        System.out.println("---------------------------------------------\n");
                    }
                    case 5 -> salir = true;
                    default -> System.out.println("Solo opciones de 1 a 5");
                }

                /**
                 * Función que presenta mensaje de error al usuario si ingresa una opción fuera del rango
                 * estipulado.
                  */
            } catch (Exception e) {
                System.out.println("Debes ingresar un número");
                sn.next();
            }
        }
    }
}
