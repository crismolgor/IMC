/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Administrativo;
import Modelo.Docente;
import Modelo.Estudiante;
import Vista.Vista;

public class Controlador {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            switch (opcion) {
                case 1:
                    gestionarIMCDocente();
                    break;
                case 2:
                    gestionarMatriculaEstudiante();
                    break;
                case 3:
                    gestionarAntiguedadAdministrativo();
                    break;
                case 4:
                    actualizarSalario();
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida");
            }
        } while (opcion != 0);
    }

    private void gestionarIMCDocente() {
        String codigo = vista.leerString("Ingrese el código del docente: ");
        double peso = vista.leerDouble("Ingrese el peso del docente (kg): ");
        double estatura = vista.leerDouble("Ingrese la estatura del docente (m): ");
        Docente docente = new Docente(codigo, "Nombre", "Apellidos", "Profesión", 0, estatura, peso);
        vista.mostrarMensaje("IMC: " + docente.calcularIMC());
        vista.mostrarMensaje("Composición corporal: " + docente.obtenerComposicionCorporal());
    }

    private void gestionarMatriculaEstudiante() {
        String codigo = vista.leerString("Ingrese el código del estudiante: ");
        int creditosTotales = vista.leerInt("Ingrese los créditos totales: ");
        int creditosActuales = vista.leerInt("Ingrese los créditos actuales: ");
        Estudiante estudiante = new Estudiante(codigo, "Nombre", "Apellidos", "Carrera", 0, creditosTotales, creditosActuales);
        if (estudiante.puedeMatricularProyectoGrado()) {
            vista.mostrarMensaje("Estudiante " + estudiante.getNombre() + " ya puedes matricular Proyecto de Grado");
        } else {
            vista.mostrarMensaje("Aún no puedes matricular Proyecto de Grado");
        }
    }

    private void gestionarAntiguedadAdministrativo() {
        String codigo = vista.leerString("Ingrese el código del administrativo: ");
        int anioIngreso = vista.leerInt("Ingrese el año de ingreso: ");
        Administrativo admin = new Administrativo(codigo, "Nombre", "Apellidos", anioIngreso);
        vista.mostrarMensaje("Antigüedad: " + admin.calcularAntiguedad() + " años");
    }

    private void actualizarSalario() {
        String codigo = vista.leerString("Ingrese el código del docente: ");
        double nuevoSalario = vista.leerDouble("Ingrese el nuevo salario: ");
        Docente docente = new Docente(codigo, "Nombre", "Apellidos", "Profesión", nuevoSalario, 0, 0);
        docente.setSalario(nuevoSalario);
        vista.mostrarMensaje("El salario del docente ha sido actualizado a: " + docente.getSalario());
    }
}

