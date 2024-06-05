package gestionHotel;

/**
 *
 * @author Grupo7PIS
 */
public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private boolean ocupada;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false; // Inicialmente la habitación está disponible
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    // Método para marcar la habitación como ocupada
    public void marcarComoOcupada() {
        this.ocupada = true;
    }
}