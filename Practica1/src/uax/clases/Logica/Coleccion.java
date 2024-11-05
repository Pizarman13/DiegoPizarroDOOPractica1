package uax.clases.Logica;

import uax.clases.Numismastica.*;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<ElementoColeccionable> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    // Añadimos una moneda a la colección
    public void addMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    // Añadimos un sello a la colección
    public void addSello(Sello sello) {
        elementos.add(sello);
    }

    // Mostramos las monedas de la colección
    public void mostrarMonedas() {
        int c = 0;

        // Recorremos la colección de elementos en busca de monedas
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                Moneda moneda = (Moneda) elemento;
                // Llamamos al método toString de la clase Moneda
                System.out.println(moneda);
                c++;
            }
        }

        // Si no hay monedas en la colección
        if (elementos.isEmpty()) {
            System.out.println("No hay monedas en la colección");
        } else if (c == 0) {
            System.out.println("No hay monedas en la colección");
        }
    }

    // Mostramos los sellos de la colección
    public void mostrarSellos() {
        int c = 0;

        // Recorremos la colección de elementos en busca de sellos
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                Sello sello = (Sello) elemento;
                // Llamamos al método toString de la clase Sello
                System.out.println(sello);
                c++;
            }
        }

        // Si no hay sellos en la colección
        if (elementos.isEmpty()) {
            System.out.println("No hay sellos en la colección");
        } else if (c == 0) {
            System.out.println("No hay sellos en la colección");
        }
    }

    // Calculamos el precio total de la colección
    public double precioTotal() {
        double precio = 0;
        for (ElementoColeccionable elemento : elementos) {
            precio += elemento.getValor();
        }
        return precio;
    }

    // Calculamos la rareza media de la colección
    public double rarezaMedia() {
        double rareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            rareza += elemento.getRareza();
        }

        // Si no hay elementos en la colección devolvemos 0 para evitar la división por 0
        if (elementos.isEmpty()) {
            return 0;
        }

        return rareza / elementos.size();
    }

}
