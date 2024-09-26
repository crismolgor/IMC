/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Docente extends Persona {
    private String profesion;
    private double salario;
    private double estatura; 
    private double peso; 

    public Docente(String codigo, String nombre, String apellidos, String profesion, double salario, double estatura, double peso) {
        super(codigo, nombre, apellidos);
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }

    public String obtenerComposicionCorporal() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Peso inferior al normal";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Peso superior al normal";
        } else {
            return "Obesidad";
        }
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}