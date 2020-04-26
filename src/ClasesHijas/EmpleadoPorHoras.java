package ClasesHijas;

import ClasePadre.CuentaAFP;

public class EmpleadoPorHoras extends CuentaAFP {

    private double sueldo; //sueldo por hora
    private double horas; //horas trabajadas por semana

    //constructor de cinco argumentos 
    public EmpleadoPorHoras(String nombre, String apellido, String nss,String DUI,
            double sueldoPorHoras, double horasTrabajadas,String estadoDeCuenta,String aportesRealizados) {
        super(nombre, apellido, nss,DUI,estadoDeCuenta,aportesRealizados);
        establecerSueldo(sueldoPorHoras);//valida y almacena el sueldo por horas
        establecerHoras(horasTrabajadas);//valida y almacena las horas trabajadas

    }

    //estabalecer el sueldo
    public void establecerSueldo(double sueldoPorHoras) {
        sueldo = (sueldoPorHoras < 0.0) ? 0.0 : sueldoPorHoras;

    }

    public double obtenerSueldo() {
        return sueldo;
    }

    //establecer las horas trabajadas
    public void establecerHoras(double horasTrabajadas) {
        horas = ((horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0))
                ? horasTrabajadas : 0.0;
    }//fin del metodo establecer horas

    //devuelve las horas trabajadas
    public double obtenerHoras() {
        return horas;
    }

    //calcula los ingresos; sobreescribe el metodo abstracto ingresos en Empleado
    public double ingresos() {

        if (obtenerHoras() <= 40) // no hay tiempo extra
        {
            return obtenerSueldo() * obtenerHoras();
        } else {
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }

    }

    //devuelve representacion String de un objeto EmpleadoPorHoras
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Sueldo por hora", obtenerSueldo(),
                "Horas trabajadas", obtenerHoras());
    }
}
