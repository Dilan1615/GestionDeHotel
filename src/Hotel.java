package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Huesped> huespedes; // Lista de huéspedes
    private List<Habitacion> habitaciones; // Lista de habitaciones

    public Hotel(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.huespedes = new ArrayList<>(); // Inicializar la lista de huéspedes
        this.habitaciones = new ArrayList<>(); // Inicializar la lista de habitaciones
    }

    // Método para agregar un huésped a la lista
    public void agregarHuesped(Huesped huesped) {
        huespedes.add(huesped);
    }

    // Método para agregar una habitación a la lista
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para obtener la lista de habitaciones
    public List<Habitacion> getHabitacionList() {
        return habitaciones;
    }
}



