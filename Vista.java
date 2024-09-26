/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular IMC de un docente");
        System.out.println("2. Verificar si un estudiante puede matricular Proyecto de Grado");
        System.out.println("3. Calcular antigüedad de un administrativo");
        System.out.println("4. Actualizar salario de un empleado");
        System.out.println("0. Salir");
    }

    public int leerOpcion() {
        int opcion = -1;
        boolean opcionValida = false;
        while (!opcionValida) {
            try {
                opcion = scanner.nextInt();
                opcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next(); 
            }
        }
        return opcion;
    }

    public String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    public double leerDouble(String mensaje) {
        double valor = -1;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.print(mensaje);
            try {
                valor = scanner.nextDouble();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número decimal válido.");
                scanner.next(); 
            }
        }
        return valor;
    }

    public int leerInt(String mensaje) {
        int valor = -1;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.print(mensaje);
            try {
                valor = scanner.nextInt();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
                scanner.next(); 
            }
        }
        return valor;
    }
}

