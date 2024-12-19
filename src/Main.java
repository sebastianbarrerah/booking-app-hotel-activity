import clases.*;
import java.util.*;


import java.lang.reflect.Array;

public class Main {

    static List<Habitacion> habitaciones = new ArrayList<>();
    static List<Alojamiento> hoteles = new ArrayList<>();

    public static void main(String[] args) {
        cargaInicial();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Aplicación Booking Hoteles\n");
        System.out.println("1. Buscar hoteles");
        System.out.println("2. Confirmar habitaciones disponibles");
        System.out.println("3. Reservar");
        System.out.println("4. Actualizar reserva");
        System.out.println("5. Salir");

        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        while (opcion != 5) {
            switch (opcion) {
                case 1 -> buscarHoteles(scanner);
                case 2 -> System.out.println("Confirmar habitaciones disponibles");
                case 3 -> System.out.println("Reservar");
                case 4 -> System.out.println("Actualizar reserva");
                case 5 -> System.out.println("Gracias por usar la aplicación Booking Hoteles");
                default -> System.out.println("Opción no válida");
            }
            System.out.println("Aplicación Booking Hoteles");
            System.out.println("1. Buscar hoteles ");
            System.out.println("2. Confirmar habitaciones disponibles  ");
            System.out.println("3. Reservar ");
            System.out.println("4. Actualizar reserva ");
            System.out.println("5. Salir ");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
    }


    public static void cargaInicial() {
        habitaciones.add(new Habitacion("cama sencilla", "Sencilla", 500000, 2, 1));
        habitaciones.add(new Habitacion("cama doble y tv en el cuarto", "Doble", 600000, 2, 2));
        habitaciones.add(new Habitacion("dos camas, tv en cuarto, equipo de sonido", "Triple", 700000, 3, 3));
        habitaciones.add(new Habitacion("suite de lujo", "Suite de lujo", 1000000, 2, 2));
        habitaciones.add(new Habitacion("cama individual", "Económica", 350000, 1, 1));
        habitaciones.add(new Habitacion("habitación para familias con 3 camas", "Familiar", 850000, 4, 2));
        habitaciones.add(new Habitacion("habitación con cama queen y oficina", "Ejecutiva", 950000, 2, 1));
        habitaciones.add(new Habitacion("habitación con cama doble y zona de estar", "Doble con sala", 700000, 2, 2));
        habitaciones.add(new Habitacion("habitación tipo loft con cocina", "Loft", 1100000, 2, 1));
        habitaciones.add(new Habitacion("habitación para pareja, jacuzzi privado", "Romántica", 1300000, 2, 1));
        habitaciones.add(new Habitacion("cabaña con vista al campo y piscina", "Finca campestre", 1200000, 2, 2));
        habitaciones.add(new Habitacion("finca con cama rústica y chimenea", "Finca moderna", 950000, 2, 2));
        habitaciones.add(new Habitacion("habitacion con cama de campo y porche", "Finca rústica", 800000, 2, 2));
        habitaciones.add(new Habitacion("cabaña con vista al lago y terraza", "Día de sol familia", 1500000, 2, 2));
        habitaciones.add(new Habitacion("bungalow con acceso directo a la zona verde", "Día de sol colonial", 2000000, 2, 2));
        habitaciones.add(new Habitacion("suite con piscina privada", "Día de sol turistico", 2500000, 2, 2));




        hoteles.add(new Hotel("Medellin", "Hotel Sol", 100000, 4.5, habitaciones.subList(0, 4)));
        hoteles.add(new Apartamento("Medellin", "Apartamento Colonial", 80000, 4.2, habitaciones.subList(5, 9)));
        hoteles.add(new Finca("Medellin", "Finca Colonial", 180000, 3.5, habitaciones.subList(10, 13)));
        hoteles.add(new DiaSol("Medellin", "El paraiso", 230000, true, true, 5, habitaciones.subList(14, 15)));
    }

    private static void buscarHoteles(Scanner scanner) {
        System.out.print("Ingrese la ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Ingrese el tipo de alojamiento (Hotel, Apartamento, Finca, Dia de Sol): ");
        String tipo = scanner.nextLine();

        System.out.print("Cantidad de adultos: ");
        int cantidadAdultos = scanner.nextInt();

        System.out.print("Cantidad de niños: ");
        int cantidadNiños = scanner.nextInt();

        System.out.print("Ingrese el día de inicio (01-31): ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el día de finalización (01-31): ");
        int fin = scanner.nextInt();

        System.out.print("Ingrese la cantidad de habitaciones: ");
        int habitacionesRequeridas = scanner.nextInt();

        if (inicio > fin || inicio < 1 || fin > 31) {
            System.out.println("Fechas inválidas. Intente de nuevo.");
            return;
        }

        int dias = fin - inicio + 1; // Calcula la cantidad de días.

        for (Alojamiento alojamiento : hoteles) {
            if (alojamiento.getCiudad().equalsIgnoreCase(ciudad) &&
                    alojamiento.getTipoAlojamiento().equalsIgnoreCase(tipo)) {

                double precioBase = alojamiento.getPrecioBase();
                double precioTotal = precioBase * dias * habitacionesRequeridas;

                // Aplicar descuentos o aumentos según las fechas.
                if (fin >= 26) {
                    double aumento = precioTotal * 0.15;
                    precioTotal += aumento;
                    System.out.println("* Se aplica un aumento del 15% por hospedarse los últimos días del mes. Monto: $" + aumento);
                } else if (inicio >= 10 && inicio <= 15) {
                    double aumento = precioTotal * 0.10;
                    precioTotal += aumento;
                    System.out.println("* Se aplica un aumento del 10% por hospedarse del 10 al 15. Monto: $" + aumento);
                } else if (inicio >= 5 && inicio <= 10) {
                    double descuento = precioTotal * 0.08;
                    precioTotal -= descuento;
                    System.out.println("* Se aplica un descuento del 8% por hospedarse del 5 al 10. Monto: $" + descuento);
                }

                // Mostrar información del alojamiento y precio total.
                System.out.println(alojamiento.mostrarInformacion() + precioBase + precioTotal);

                // Si es un 'DiaSol', mostrar detalles adicionales.
                if (alojamiento instanceof DiaSol) {
                    DiaSol diaSol = (DiaSol) alojamiento;
                    System.out.println("Incluye almuerzo: " + diaSol.isIncluirAlmuerzo());
                    System.out.println("Incluye refrigerio: " + diaSol.isIncluirRefrigerio());
                }
            }
        }
    }




}


