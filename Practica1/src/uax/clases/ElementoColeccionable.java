package uax.clases;

public abstract class ElementoColeccionable {

    protected String pais;
    protected String autoridadGobernamte;
    protected int annus;
    protected double valor;
    protected String unidadMonetaria;
    protected int rareza;   // 0 - 100
    protected double precio;

    public ElementoColeccionable(String pais, String autoridadGobernamte, int annus, double valor, String unidadMonetaria, int rareza, double precio) {
        this.pais = pais;
        this.autoridadGobernamte = autoridadGobernamte;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }
}