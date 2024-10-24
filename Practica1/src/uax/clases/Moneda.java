package uax.clases;

public class Moneda extends ElementoColeccionable{

    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private EstadoConservacion estadoConservacion;

    public Moneda(String pais, String autoridadGobernamte, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacion estadoConservacion) {
        super(pais, autoridadGobernamte, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

}
