/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionHotel;

/**
 *
 * @author Grupo7PIS
 */

enum SERVICIOS_EXTRAS {
    MOVILIZACION(20.0),
    RESTAURANTE(30.0),
    BAR(15.0),
    TOURS(50.0),
    RECEPCIONISTA(25.0);

    private final double costo;
    private double costoServiciosExtras;

    SERVICIOS_EXTRAS(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
    
    public void actualizarCostoServiciosExtras(double costoServiciosExtras) {
    this.costoServiciosExtras = costoServiciosExtras;
}

}
