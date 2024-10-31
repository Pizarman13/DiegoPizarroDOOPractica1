package uax.clases;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Coleccion coleccion = new Coleccion();

        boolean salir = true;

        do {

            System.out.println("1. Añadir una nueva moneda");
            System.out.println("2. Añadir un nuevo sello");
            System.out.println("3. Mostrar todas las monedas");
            System.out.println("4. Mostrar todos los sellos");
            System.out.println("5. Mostrar el precio total de la colección");
            System.out.println("6. Mostrar la rareza media de la colección");
            System.out.println("0. Salir");

            System.out.println("Introduce una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el país");
                    String pais = sc.next();
                    System.out.println("Introduce la autoridad gobernante");
                    String autoridadGobernamte = sc.next();
                    System.out.println("Introduce el año");
                    int annus = sc.nextInt();
                    System.out.println("Introduce el valor");
                    double valor = sc.nextDouble();
                    System.out.println("Introduce la unidad monetaria");
                    String unidadMonetaria = sc.next();
                    System.out.println("Introduce la rareza (0 - 100)");
                    int rareza = sc.nextInt();

                    while (rareza < 0 || rareza > 100) {
                        System.out.println("Introduce la rareza (0 - 100)");
                        rareza = sc.nextInt();
                    }
                    System.out.println("Introduce el precio");
                    double precio = sc.nextDouble();
                    System.out.println("Introduce la composición");
                    String composicion = sc.next();
                    System.out.println("Introduce el peso");
                    double peso = sc.nextDouble();
                    System.out.println("Introduce el diámetro");
                    double diametro = sc.nextDouble();
                    System.out.println("Introduce el grosor");
                    double grosor = sc.nextDouble();
                    System.out.println("Introduce el estado de conservación (G, VG, F, VF, XF, AU, UNC)");
                    EstadoConservacionM estadoConservacion = EstadoConservacionM.valueOf(sc.next().toUpperCase());

                    Moneda moneda = new Moneda(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
                    coleccion.addMoneda(moneda);
                    break;
                case 2:
                    System.out.println("Introduce el país");
                    pais = sc.next();
                    System.out.println("Introduce la autoridad gobernante");
                    autoridadGobernamte = sc.next();
                    System.out.println("Introduce el año");
                    annus = sc.nextInt();
                    System.out.println("Introduce el valor");
                    valor = sc.nextDouble();
                    System.out.println("Introduce la unidad monetaria");
                    unidadMonetaria = sc.next();
                    System.out.println("Introduce la rareza (0 - 100)");
                    rareza = sc.nextInt();

                    while (rareza < 0 || rareza > 100) {
                        System.out.println("Introduce la rareza (0 - 100)");
                        rareza = sc.nextInt();
                    }

                    System.out.println("Introduce el precio");
                    precio = sc.nextDouble();
                    System.out.println("Introduce la altura");
                    double altura = sc.nextDouble();
                    System.out.println("Introduce la anchura");
                    double anchura = sc.nextDouble();
                    System.out.println("Introduce la imagen");
                    String imagen = sc.next();
                    System.out.println("Introduce el estado de conservación (U, NSG, NF, N)");
                    EstadoConservacionS estadoConservacionS = EstadoConservacionS.valueOf(sc.next());

                    Sello sello = new Sello(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio, altura, anchura, imagen, estadoConservacionS);
                    coleccion.addSello(sello);
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
                    salir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }


        } while (salir);
    }
}