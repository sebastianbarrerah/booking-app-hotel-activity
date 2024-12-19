package clases;

import java.time.LocalDate;

public class Habitacion {
     String descripcion;
     String tipoHabitacion;
     double precioBase;
     int capacidadMayores;
     int capacidadMenores;
     LocalDate disponibilidad;

    public Habitacion() {}

    public Habitacion(String descripcion, String tipoHabitacion, double precioBase, int capacidadMayores, int capacidadMenores) {
        this.descripcion = descripcion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioBase = precioBase;
        this.capacidadMayores = capacidadMayores;
        this.capacidadMenores = capacidadMenores;
    }

    public String mostrarInformacion() {
        return "Tipo " + getTipoHabitacion() + " descripcion" + getDescripcion();
    }

    @Override
    public String toString() {
        return "Habitación {" +
                "Descripción='" + descripcion + '\'' +
                ", Tipo='" + tipoHabitacion + '\'' +
                ", Precio Base=" + precioBase +
                ", Capacidad Mayores=" + capacidadMayores +
                ", Capacidad Menores=" + capacidadMenores +
                '}';
    }


    LocalDate obtenerDisponibilidad() {
        return disponibilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCapacidadMayores() {
        return capacidadMayores;
    }

    public void setCapacidadMayores(int capacidadMayores) {
        this.capacidadMayores = capacidadMayores;
    }

    public int getCapacidadMenores() {
        return capacidadMenores;
    }

    public void setCapacidadMenores(int capacidadMenores) {
        this.capacidadMenores = capacidadMenores;
    }

    public LocalDate getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(LocalDate disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}