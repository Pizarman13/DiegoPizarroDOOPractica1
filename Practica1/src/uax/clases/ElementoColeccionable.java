package uax.clases;

public abstract class ElementoColeccionable {

    protected String pais;
    protected String autoridadGobernamte;
    protected int annus;
    protected double valor;
    protected String unidadMonetaria;
    protected int rareza;
    protected double precio;

    public ElementoColeccionable(String pais, String autoridadGobernamte, int annus, double valor, String unidadMonetaria, int rareza, double precio) {
        this.pais = pais;
        this.autoridadGobernamte = autoridadGobernamte;
        this.annus = annus;
        this.valor = valor;
        if(this.valor < 0 || this.valor > 100) {
            throw new IllegalArgumentException("El valor debe estar entre 0 y 100");
        }
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }
}