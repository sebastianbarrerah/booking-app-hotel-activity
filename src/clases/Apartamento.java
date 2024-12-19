package clases;

import java.util.List;

public class Apartamento extends Alojamiento {

    public Apartamento() {
    }

    public Apartamento(String ciudad, String nombre, double precioBase, double calificacion, List<Habitacion> habitaciones) {
        super(ciudad,"Apartamento",nombre,precioBase, calificacion, habitaciones);
    }
    @Override
    double calcularPrecioTotal() {
        return precioBase * 1.1; // Ejemplo: 10% de incremento
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
