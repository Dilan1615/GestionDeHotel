package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
import java.time.LocalDate;

public class Reserva {
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Habitacion habitacion;
    private Huesped huesped;
    private String estado;
    private double costoServiciosExtras;

    public Reserva(int id, LocalDate fechaInicio, LocalDate fechaFin, Habitacion habitacion, Huesped huesped) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.estado = "PENDIENTE";
        this.costoServiciosExtras = 0.0; 
    }

    public void crearReserva() {
        this.estado = "CONFIRMADA";
    }

    public void cancelarReserva() {
        this.estado = "CANCELADA";
    }

    public void editarReserva(LocalDate nuevaFechaInicio, LocalDate nuevaFechaFin, Habitacion nuevaHabitacion) {
        this.fechaInicio = nuevaFechaInicio;
        this.fechaFin = nuevaFechaFin;
        this.habitacion = nuevaHabitacion;
    }

    public void checkIn() {
        this.estado = "EN PROCESO";
    }

    public void checkOut() {
        this.estado = "COMPLETADA";
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoServiciosExtras() {
        return costoServiciosExtras;
    }

    public void setCostoServiciosExtras(double costoServiciosExtras) {
        this.costoServiciosExtras = costoServiciosExtras;
    }

    public void actualizarCostoServiciosExtras(double costoTotalServiciosExtras) {
        this.costoServiciosExtras = costoTotalServiciosExtras;
    }
}
