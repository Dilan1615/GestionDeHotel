package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
import java.time.LocalDate;

public class Factura {
    private int id;
    private String detalles;
    private LocalDate fecha;
    private double costoTotal;
    private Reserva reserva;

    public Factura(int id, String detalles, LocalDate fecha, double costoTotal, Reserva reserva) {
        this.id = id;
        this.detalles = detalles;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.reserva = reserva;
    }

    public void generarFactura() {
        double costoTotalReserva = reserva.getHabitacion().getPrecio() * 
                                    ((reserva.getFechaFin().getDayOfYear() - reserva.getFechaInicio().getDayOfYear()) + 1);
        this.costoTotal = costoTotalReserva + reserva.getCostoServiciosExtras();
        System.out.println("Factura generada con ID: " + id);
        System.out.println("Detalles de la factura ID: " + id + ":");
        System.out.println("Detalles: " + detalles);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: " + costoTotal);
    }

}
