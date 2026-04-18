package com.mycompany.nominaapp;

public class Empleado {

    private String nombre;
    private double sueldoDiario;
    private int asistencias;
    private int faltas;
    private int retardos;
    private int vacaciones;

    public Empleado(String nombre, double sueldoDiario) {
        this.nombre = nombre;
        this.sueldoDiario = sueldoDiario;
        this.asistencias = 0;
        this.faltas = 0;
        this.retardos = 0;
        this.vacaciones = 0;
    }

    // Métodos para registrar eventos
    public void registrarAsistencia() {
        asistencias++;
    }

    public void registrarFalta() {
        faltas++;
    }

    public void registrarRetardo() {
        retardos++;
    }

    public void registrarVacaciones() {
        vacaciones++;
    }

    // Cálculo de nomina
    public double calcularNomina() {
        double pagoAsistencias = asistencias * sueldoDiario;
        double descuentoFaltas = faltas * sueldoDiario;
        double descuentoRetardos = retardos * (sueldoDiario * 0.25); // penalización leve
        double pagoVacaciones = vacaciones * sueldoDiario;

        return pagoAsistencias + pagoVacaciones - descuentoFaltas - descuentoRetardos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public int getRetardos() {
        return retardos;
    }

    public int getVacaciones() {
        return vacaciones;
    }
}
