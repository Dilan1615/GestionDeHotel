package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
public class Huesped {
    private String nombre;
    private String telefono;
    private int numeroHabitacion;

    public Huesped(String nombre, String telefono, int numeroReserva) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numeroHabitacion = numeroReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroReserva() {
        return numeroHabitacion;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroHabitacion = numeroReserva;
    }
}
