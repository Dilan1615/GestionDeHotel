package gestionhotel;

/**
 *
 * @author Grupo7PIS
 */
import java.util.Random;

enum ESTADO_RESERVA {
    SOLICITADA, EN_PROCESO, COMPLETADA;

    public static ESTADO_RESERVA generarEstadoAleatorio() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
