package clases;

import java.util.List;

public class Hotel extends Alojamiento {

    public Hotel(String ciudad, String nombre, double precioBase, double calificacion, List<Habitacion> habitaciones) {
        super(ciudad, "Hotel", nombre, precioBase, calificacion, habitaciones);
    }


    double calcularPrecioTotal() {

        return getPrecioBase() * 1.2; // Ejemplo: 20% de incremento
    }

    public String mostrarInformacion() {
        return "Hotel: " + getNombre() +
                " en " + getCiudad() +
                " Tipo: " + getTipoAlojamiento() +
                " Precio base: " + getPrecioBase() +
                " Calificación: " + getCalificacion() +
                "\nHabitaciones: " + getHabitaciones();
    }

}
