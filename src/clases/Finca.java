package clases;

import java.util.List;

public class Finca extends Alojamiento {

    public Finca() {
    }

    public Finca(String ciudad, String nombre, double precioBase, double calificacion, List<Habitacion> habitaciones)  {
        super(ciudad,"Finca",nombre,precioBase, calificacion, habitaciones);
    }
    double calcularPrecioTotal() {
        return precioBase * 1.15; // Ejemplo: 15% de incremento
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