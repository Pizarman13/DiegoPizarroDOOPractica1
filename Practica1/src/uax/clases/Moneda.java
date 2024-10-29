package uax.clases;

public class Moneda extends ElementoColeccionable{

    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private EstadoConservacionM estadoConservacion;

    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacionM estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    public String toString() {
        return "Moneda {" + " Pais: " + pais + ", Autoridad Gobernante: " + autoridadGobernamte + ", Ano: " + annus + ", Valor: " + valor + ", unidadMonetaria: " + unidadMonetaria + ", Rareza: " + rareza + ", Precio: " + precio + ", Composicion:" + composicion + ", Peso: " + peso + ", Diametro: " + diametro + ", Grosor: " + grosor + ", estadoConservacion=" + estadoConservacion + '}';
    }

}
