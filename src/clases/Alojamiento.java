package clases;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public abstract class Alojamiento {
    String ciudad;
    String tipoAlojamiento; // Podría ser un enum para mayor control
    List<Habitacion> habitaciones;
    double calificacion;
    String nombre;
    double precioBase;

    public Alojamiento(){};

    public Alojamiento(String ciudad, String tipoAlojamiento, String nombre, double precioBase, double calificacion, List<Habitacion> habitaciones) {
        this.ciudad = ciudad;
        this.tipoAlojamiento = tipoAlojamiento;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.calificacion = calificacion;
        this.habitaciones = habitaciones;
    }

    double calcularPrecioTotal(){
        return 0;
    };

    public abstract String mostrarInformacion();


    void actualizarReservas() {
        System.out.println("Reservas actualizadas para " + nombre);
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}