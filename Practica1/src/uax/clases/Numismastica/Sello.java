package uax.clases.Numismastica;

public class Sello extends ElementoColeccionable {

    private double altura;
    private double anchura;
    private String imagen;
    private EstadoConservacionS estadoConservacion;

    public Sello(String pais, String autoridadGobernamte, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, String imagen, EstadoConservacionS estadoConservacion) {
        super(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    public String toString() {
        return "Sello {" + " Pais: " + pais + ", Autoridad Gobernante: " + autoridadGobernamte + ", Ano: " + annus + ", Valor: " + valor + ", unidadMonetaria: " + unidadMonetaria + ", Rareza: " + rareza + ", Precio: " + precio + ", Altura: " + altura + ", Anchura: " + anchura + ", Imagen: " + imagen + ", estadoConservacion=" + estadoConservacion + '}';
    }
}
