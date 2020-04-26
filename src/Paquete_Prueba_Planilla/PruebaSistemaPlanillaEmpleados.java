/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_Prueba_Planilla;

import ClasePadre.CuentaAFP;
import ClasesHijas.EmpleadoAsalariado;
import ClasesHijas.EmpleadoBaseMasComision;
import ClasesHijas.EmpleadoPorComision;
import ClasesHijas.EmpleadoPorHoras;

public class PruebaSistemaPlanillaEmpleados {

    public static void main(String[] args) {

        //Creamos objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Fernando", "Blanco", "14789", "123456", 250.30, "123,45", "550.00");
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Luis", "Gonzalez", "12345678", "12345678910", 10, 8, "200.56", "300.00");
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Mario", "Antonio",
                "123456", "12345678956", 1000, .06, "4000", "600.00");
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Jose", "Rivera", "123456", "12345678147",
                1000, .04, 300, "7000", "4568");

        //crar un arreglo Empleado de cuatro elementos
        CuentaAFP empleados[] = new CuentaAFP[4];

        //iniciar el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Planilla de pagos de empleados. Empleando el polimorfismo\n");

        //procesa en forma generica a cada elemento en el arreglo de empleados
        for (CuentaAFP empleadoActual : empleados) {
            System.out.println(empleadoActual); //invoca el toString

            //determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {

                //conversion descendente de la referencia de empleado
                //a una referencia  de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;

                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
                System.out.printf("el nuevo salario base con10%% de aumento es : $%,.2f\n",
                        empleado.obtenerSalarioBase());
            }
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }//fin del for

        //obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
        }

    }

}
