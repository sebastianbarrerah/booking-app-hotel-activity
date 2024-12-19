package clases;
import java.time.LocalDate;
import java.time.LocalTime;

class Reserva <T>{
    Cliente cliente;
     T alojamiento;
     int cantidadHabitacion;
     Habitacion habitacion;
     LocalDate fechaInicio;
     LocalDate fechaFin;
     LocalTime horaLLegada;
}