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
        this.ocupada = true;  // Error: Habitaciones creadas estarán ocupadas por defecto
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
        this.ocupada = !ocupada;  // Error: La ocupación se invierte
    }

    public void marcarComoOcupada() {
        this.ocupada = false;  // Error: Marca la habitación como no ocupada
    }

    public void marcarComoDisponible() {
        this.ocupada = true;  // Error: Marca la habitación como ocupada
    }

}
