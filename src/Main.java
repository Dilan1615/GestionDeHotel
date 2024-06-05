package gestionHotel;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Mar Azul", "Calle 18 de Noviembre", "0985741420", "hotelmarazul@gmail.com");

        hotel.agregarHabitacion(new Habitacion(101, "DOBLE", 100.0f));
        hotel.agregarHabitacion(new Habitacion(102, "TRIPLE", 150.0f));
        hotel.agregarHabitacion(new Habitacion(103, "INDIVIDUAL", 80.0f));
        hotel.agregarHabitacion(new Habitacion(104, "MATRIMONIAL", 250.0f));
        hotel.agregarHabitacion(new Habitacion(105, "FAMILIAR", 125.0f));
        hotel.agregarHabitacion(new Habitacion(106, "VIP", 450.0f));
        hotel.agregarHabitacion(new Habitacion(107, "ESTANDAR", 50.0f));
        hotel.agregarHabitacion(new Habitacion(108, "SUITE", 325.0f));

        Scanner scanner = new Scanner(System.in);
        boolean finalizar = false;

        System.out.println("Bienvenido al Hotel Mar Azul; Ofrecemos una amplia gama de servicios para que tu estancia sea lo mas placentera posible.");

        System.out.println("Desea reservar una habitacion (Si/No)");
        String respuestaReserva = scanner.nextLine();

        if (!respuestaReserva.equalsIgnoreCase("Si")) {
            System.out.println("Gracias por considerar el Hotel Mar Azul. ¡Hasta luego!");
            return;
        }

        do {
            System.out.println("Ingrese el nombre del huesped:");
            String nombreHuesped = scanner.nextLine();
            System.out.println("Ingrese el telefono del huesped:");
            String telefonoHuesped = scanner.nextLine();

            Huesped huesped = new Huesped(nombreHuesped, telefonoHuesped, 0);
            hotel.agregarHuesped(huesped);

            System.out.println("Seleccione un tipo de habitacion (elija un numero):");
            for (Habitacion habitacion : hotel.getHabitacionList()) {
                System.out.println("Numero: " + habitacion.getNumero() + ", Tipo: " + habitacion.getTipo() + ", Precio: " + habitacion.getPrecio());
            }

            int numeroHabitacionSeleccionada = scanner.nextInt();
            scanner.nextLine();
            Habitacion habitacionSeleccionada = hotel.getHabitacionList().stream()
                    .filter(h -> h.getNumero() == numeroHabitacionSeleccionada)
                    .findFirst()
                    .orElse(null);

            if (habitacionSeleccionada == null) {
                System.out.println("Habitacion no valida.");
                continue;
            }

            if (habitacionSeleccionada.isOcupada()) {
                System.out.println("Lo sentimos, esta habitacion ya esta ocupada. Por favor, seleccione otra habitacion.");
                continue;
            }

            habitacionSeleccionada.marcarComoOcupada();

            System.out.println("Ingrese la fecha de inicio (yyyy-MM-dd):");
            String fechaInicioStr = scanner.next();
            LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
            System.out.println("Ingrese la fecha de fin (yyyy-MM-dd):");
            String fechaFinStr = scanner.next();
            LocalDate fechaFin = LocalDate.parse(fechaFinStr);

            System.out.println("Seleccione los servicios extras (separados por coma):");
            for (SERVICIOS_EXTRAS servicio : SERVICIOS_EXTRAS.values()) {
                System.out.println(servicio.ordinal() + ". " + servicio + " - Costo: " + servicio.getCosto());
            }
            scanner.nextLine();

            String[] serviciosExtrasStr = scanner.nextLine().split(",");
            double costoTotalServiciosExtras = 0.0;
            for (String servicioStr : serviciosExtrasStr) {
                int servicioIndex = Integer.parseInt(servicioStr.trim());
                SERVICIOS_EXTRAS servicio = SERVICIOS_EXTRAS.values()[servicioIndex];
                costoTotalServiciosExtras += servicio.getCosto();
            }

            Reserva reserva = new Reserva(1, fechaInicio, fechaFin, habitacionSeleccionada, huesped);
            reserva.actualizarCostoServiciosExtras(costoTotalServiciosExtras);
            reserva.crearReserva();

            System.out.println("-----------------------------------------------------------------");
            Factura factura = new Factura((int) (Math.random() * 1000), "Detalles de la factura", LocalDate.now(), 0, reserva);
            factura.generarFactura();
            System.out.println("-----------------------------------------------------------------");

            System.out.println("¿Que desea hacer?");
            System.out.println("1. Editar huesped");
            System.out.println("2. Agregar otro huesped");
            System.out.println("3. Finalizar programa");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del huesped:");
                    String nuevoNombreHuesped = scanner.nextLine();
                    System.out.println("Ingrese el nuevo telefono del huesped:");
                    String nuevoTelefonoHuesped = scanner.nextLine();
                    huesped.setNombre(nuevoNombreHuesped);
                    huesped.setTelefono(nuevoTelefonoHuesped);
                    finalizar = true;
                    break;
                case 2:
                    finalizar = false;
                    break;
                case 3:
                    finalizar = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    finalizar = true;
                    break;
            }

        } while (!finalizar);

        System.out.println("Gracias por hospedarte en el Hotel Mar Azul. ¡Hasta luego!");
    }
}
