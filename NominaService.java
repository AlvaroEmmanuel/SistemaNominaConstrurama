package com.mycompany.nominaapp;
import java.util.ArrayList;

public class NominaService {
    
 private ArrayList<Empleado> empleados;

    public NominaService() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, double sueldo) {
        empleados.add(new Empleado(nombre, sueldo));
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado obtenerEmpleado(int index) {
        if (index >= 0 && index < empleados.size()) {
            return empleados.get(index);
        }
        return null;
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        int i = 1;
        for (Empleado e : empleados) {
            System.out.println(i + ". " + e.getNombre());
            i++;
        }
    }
}
