package ClasesHijas;

import ClasePadre.Empleado;

public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision;//porcentaje de comision

    //constructor de cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss,
            double ventas, double tarifa) {
        super(nombre, apellido, nss);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }

    //establecer la tarifa de comision
    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;

    }

    //devuelve la tarifa de comision
    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    //establece e monto de ventas brutas
    public void establecerVentasBrutas(double ventas) {
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
    }

    //devuelve el monto de ventas brutas
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    //calcula los ingresos; sobrescribe el metodo abstracto ingresos en Empleado
    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    public String toString() {
        return String.format("%s: %s\n%s; $%,.2f; %s: %.2f",
                "empleado por comision", super.toString(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision());
    }

}
