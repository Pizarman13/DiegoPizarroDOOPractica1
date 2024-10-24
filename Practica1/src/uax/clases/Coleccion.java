package uax.clases;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<ElementoColeccionable> elementos;

    public Coleccion() {
        elementos = new ArrayList<>();
    }

    public void addMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public void addSello(Sello sello) {
        elementos.add(sello);
    }

    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                Moneda moneda = (Moneda) elemento;
                System.out.println(moneda);
            }
        }
    }

    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                Sello sello = (Sello) elemento;
                System.out.println(sello);
            }
        }
    }

    public double precioTotal() {
        double precio = 0;
        for (ElementoColeccionable elemento : elementos) {
            precio += elemento.valor;
        }
        return precio;
    }

    public double rarezaMedia() {
        double rareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            rareza += elemento.rareza;
        }
        return rareza / elementos.size();
    }


}
