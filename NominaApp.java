package com.mycompany.nominaapp;
import java.util.Scanner;


public class NominaApp {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NominaService service = new NominaService();

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE NOMINA ===");
            System.out.println("1. Alta de empleado");
            System.out.println("2. Registrar evento (asistencia/falta/retardo/vacaciones)");
            System.out.println("3. Calcular nomina");
            System.out.println("4. Mostrar empleados");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Sueldo diario: ");
                    double sueldo = sc.nextDouble();

                    if (sueldo <= 0) {
                        System.out.println("Sueldo inválido.");
                        break;
                    }

                    service.agregarEmpleado(nombre, sueldo);
                    System.out.println("Empleado agregado.");
                    break;

                case 2:
                    service.mostrarEmpleados();
                    System.out.print("Selecciona empleado: ");
                    int index = sc.nextInt() - 1;

                    Empleado emp = service.obtenerEmpleado(index);

                    if (emp == null) {
                        System.out.println("Empleado inválido.");
                        break;
                    }

                    System.out.println("1. Asistencia");
                    System.out.println("2. Falta");
                    System.out.println("3. Retardo");
                    System.out.println("4. Vacaciones");
                    System.out.print("Opcion: ");
                    int tipo = sc.nextInt();

                    switch (tipo) {
                        case 1:
                            emp.registrarAsistencia();
                            break;
                        case 2:
                            emp.registrarFalta();
                            break;
                        case 3:
                            emp.registrarRetardo();
                            break;
                        case 4:
                            emp.registrarVacaciones();
                            break;
                        default:
                            System.out.println("Opcion inválida");
                    }

                    System.out.println("Registro actualizado.");
                    break;

                case 3:
                    for (Empleado e : service.getEmpleados()) {
                        System.out.println("\nEmpleado: " + e.getNombre());
                        System.out.println("Asistencias: " + e.getAsistencias());
                        System.out.println("Faltas: " + e.getFaltas());
                        System.out.println("Retardos: " + e.getRetardos());
                        System.out.println("Vacaciones: " + e.getVacaciones());
                        System.out.println("Pago total: $" + e.calcularNomina());
                    }
                    break;

                case 4:
                    service.mostrarEmpleados();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción invalida");
            }

        } while (opcion != 5);
    }
}
