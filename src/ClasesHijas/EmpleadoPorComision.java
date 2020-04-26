package ClasesHijas;

import ClasePadre.CuentaAFP;

public class EmpleadoPorComision extends CuentaAFP {

    private double ventasBrutas; //ventas totales por semana
    private double tarifaComision;//porcentaje de comision

    //constructor de cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss,String DUI,
            double ventas, double tarifa,String estadoDeCuenta,String aportesRealizados) {
        super(nombre, apellido, nss,DUI,estadoDeCuenta,aportesRealizados);
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
                "Empleado por comision", super.toString(),
                "Ventas brutas", obtenerVentasBrutas(),
                "Tarifa de comision", obtenerTarifaComision());
    }

}
