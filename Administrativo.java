/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.Year;

public class Administrativo extends Persona {
    private int anioIngreso;

    public Administrativo(String codigo, String nombre, String apellidos, int anioIngreso) {
        super(codigo, nombre, apellidos);
        this.anioIngreso = anioIngreso;
    }

    public int calcularAntiguedad() {
        return Year.now().getValue() - anioIngreso;
    }

    
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
}
