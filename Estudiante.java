/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;
    private int creditosTotales;
    private int creditosActuales;

    public Estudiante(String codigo, String nombre, String apellidos, String carrera, int semestre, int creditosTotales, int creditosActuales) {
        super(codigo, nombre, apellidos);
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditosTotales = creditosTotales;
        this.creditosActuales = creditosActuales;
    }

    public boolean puedeMatricularProyectoGrado() {
        return (creditosActuales / (double) creditosTotales) >= 0.9;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public int getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(int creditosActuales) {
        this.creditosActuales = creditosActuales;
    }
}
