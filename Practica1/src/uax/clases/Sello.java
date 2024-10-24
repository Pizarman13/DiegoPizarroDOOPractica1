package uax.clases;

public class Sello extends ElementoColeccionable{

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
}
