package gestionhotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Factura {
    private int id;
    private String detalles;
    private LocalDate fecha;
    private float total;
    private Reserva reserva;
}
