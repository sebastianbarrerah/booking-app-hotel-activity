package clases;

import java.util.List;

public class DiaSol extends Alojamiento {
    private boolean incluirAlmuerzo;
    private boolean incluirRefrigerio;

    public DiaSol() {
    }

    public DiaSol(String ciudad, String nombre, double precioBase, boolean incluirAlmuerzo, boolean incluirRefrigerio, double calificacion, List<Habitacion> habitaciones) {
        super(ciudad,"Dia de Sol",nombre,precioBase, calificacion, habitaciones);
        this.incluirAlmuerzo = incluirAlmuerzo;
        this.incluirRefrigerio = incluirRefrigerio;
    }

    double calcularPrecioTotal() {
        double precioTotal;
        return precioTotal = precioBase;
    }

    public String mostrarInformacion() {
        return "Hotel: " + getNombre() +
                " en " + getCiudad() +
                " Tipo: " + getTipoAlojamiento() +
                " Precio base: " + getPrecioBase() +
                " Calificación: " + getCalificacion() +
                "\nHabitaciones: " + getHabitaciones();
    }

    public boolean isIncluirAlmuerzo() {
        return incluirAlmuerzo;
    }

    public void setIncluirAlmuerzo(boolean incluirAlmuerzo) {
        this.incluirAlmuerzo = incluirAlmuerzo;
    }

    public boolean isIncluirRefrigerio() {
        return incluirRefrigerio;
    }

    public void setIncluirRefrigerio(boolean incluirRefrigerio) {
        this.incluirRefrigerio = incluirRefrigerio;
    }
}