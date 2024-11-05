package uax.clases.Interfaz;

import uax.clases.Logica.Coleccion;
import uax.clases.Numismastica.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();
        boolean salir = true;

        // Menu
        do {

            System.out.println("1. Añadir una nueva moneda");
            System.out.println("2. Añadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostrar todos los sellos");
            System.out.println("5. Mostrar el precio total de la colección");
            System.out.println("6. Mostrar la rareza media de la colección");
            System.out.println("0. Salir");

            int opcion = solicitarInt("Introduce una opcion: ", sc);

            switch (opcion) {
                case 1:
                    String pais = solicitarString("Introduce el país: ", sc);
                    sc.nextLine(); // Limpiar el buffer
                    String autoridadGobernamte = solicitarString("Introduce la autoridad gobernante: ", sc);
                    sc.nextLine();
                    int annus = solicitarInt("Introduce el año: ", sc);
                    double valor = solicitarDouble("Introduce el valor: ", sc);
                    String unidadMonetaria = solicitarString("Introduce la unidad monetaria: ", sc);
                    sc.nextLine();
                    int rareza = solicitarInt("Introduce la rareza (0 - 100): ", sc, 0, 100);
                    double precio = solicitarDouble("Introduce el precio: ", sc);
                    String composicion = solicitarString("Introduce la composición: ", sc);
                    sc.nextLine();
                    double peso = solicitarDouble("Introduce el peso: ", sc);
                    double diametro = solicitarDouble("Introduce el diámetro: ", sc);
                    double grosor = solicitarDouble("Introduce el grosor: ", sc);
                    EstadoConservacionM estadoConservacion = solicitarEstadoConservacionMoneda("Introduce el estado de conservación (G, VG, F, VF, XF, AU, UNC): ", sc);

                    Moneda moneda = new Moneda(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
                    coleccion.addMoneda(moneda);
                    System.out.println("Moneda añadida correctamente");
                    break;
                case 2:
                    pais = solicitarString("Introduce el país: ", sc);
                    sc.nextLine();  // Limpiar el buffer
                    autoridadGobernamte = solicitarString("Introduce la autoridad gobernante: ", sc);
                    sc.nextLine();
                    annus = solicitarInt("Introduce el año: ", sc);
                    valor = solicitarDouble("Introduce el valor: ", sc);
                    unidadMonetaria = solicitarString("Introduce la unidad monetaria: ", sc);
                    sc.nextLine();
                    rareza = solicitarInt("Introduce la rareza (0 - 100): ", sc, 0, 100);
                    precio = solicitarDouble("Introduce el precio: ", sc);
                    double altura = solicitarDouble("Introduce la altura: ", sc);
                    double anchura = solicitarDouble("Introduce la anchura: ", sc);
                    String imagen = solicitarString("Introduce la imagen: ", sc);
                    sc.nextLine();
                    EstadoConservacionS estadoConservacionS = solicitarEstadoConservacionSello("Introduce el estado de conservación (U, NSG, NF, N): ", sc);

                    Sello sello = new Sello(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio, altura, anchura, imagen, estadoConservacionS);
                    coleccion.addSello(sello);
                    System.out.println("Sello añadido correctamente");
                    break;
                case 3:
                    coleccion.mostrarMonedas();
                    break;
                case 4:
                    coleccion.mostrarSellos();
                    break;
                case 5:
                    System.out.println("El precio total de la colección es: " + coleccion.precioTotal());
                    break;
                case 6:
                    System.out.println("La rareza media de la colección es: " + coleccion.rarezaMedia());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (salir);
    }

    // Metdos para controlar la entrada de datos
    private static int solicitarInt(String mensaje, Scanner sc) {
        int valor = 0;
        while (true) {
            System.out.print(mensaje);
            try {
                valor = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Introduce un número entero.");
                sc.next();
            }
        }
        return valor;
    }

    private static int solicitarInt(String mensaje, Scanner sc, int min, int max) {
        int valor = 0;
        while (true) {
            valor = solicitarInt(mensaje, sc);
            if (valor >= min && valor <= max) {
                break;
            }
            System.out.println("El valor debe estar entre " + min + " y " + max + ".");
        }
        return valor;
    }

    private static double solicitarDouble(String mensaje, Scanner sc) {
        double valor = 0.0;
        while (true) {
            System.out.print(mensaje);
            try {
                valor = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Introduce un número decimal.");
                sc.next();
            }
        }
        return valor;
    }

    private static String solicitarString(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        return sc.next();
    }

    private static EstadoConservacionM solicitarEstadoConservacionMoneda(String mensaje, Scanner sc) {
        EstadoConservacionM estado = null;
        while (true) {
            System.out.print(mensaje);
            try {
                estado = EstadoConservacionM.valueOf(sc.next().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Estado de conservación inválido. Intenta de nuevo.");
            }
        }
        return estado;
    }

    private static EstadoConservacionS solicitarEstadoConservacionSello(String mensaje, Scanner sc) {
        EstadoConservacionS estado = null;
        while (true) {
            System.out.print(mensaje);
            try {
                estado = EstadoConservacionS.valueOf(sc.next().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Estado de conservación inválido. Intenta de nuevo.");
            }
        }
        return estado;
    }
}