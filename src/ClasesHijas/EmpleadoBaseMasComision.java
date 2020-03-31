package ClasesHijas;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase; //salario base por semana

    //constructor con sis argumentos 
    public EmpleadoBaseMasComision(String nombre, String apellido,
            String nss,String DUI, double ventas, double tarifa, double salario ) {
        super(nombre, apellido, nss,DUI, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    //establecer salario base
    public void establecerSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;//positivo
    }

    //devuelve el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }

    //devuelve los ingresos; sobrescribe el metodo ingresos en EmpleadoPorComision
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    //devuelve representacion String de un objeto EmpleadoBaseMasComision
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());
    }

}
