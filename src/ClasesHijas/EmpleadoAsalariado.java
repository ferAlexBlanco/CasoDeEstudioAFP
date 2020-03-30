package ClasesHijas;

import ClasePadre.Empleado;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    //constrcutor de cuatro argumentos
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);//los pasa al constructor de Empleado
        establecerSalarioSemanal(salario);//valida y almacena el salario

    }

    //establece el salario
    public void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }

    //devuelve el salario
    public double obtenerSalarioSemanal() {
        return salarioSemanal;

    }

    //Calcula los ingresos; sobrescribe el metodo abstracto ingresos en Empleado
    public double ingresos() {
        return obtenerSalarioSemanal();
    }

    //devuelve representacion String de un objeto EmpleadoAsalariado
    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }

}
