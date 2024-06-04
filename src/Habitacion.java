package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
public class Habitacion {

    private int numero;
    private String tipo;
    private float precio;
    private boolean ocupada;

    public Habitacion(int numero, String tipo, float precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void marcarComoOcupada() {
        this.ocupada = true;
    }

    public void marcarComoDisponible() {
        this.ocupada = false;
    }

}
