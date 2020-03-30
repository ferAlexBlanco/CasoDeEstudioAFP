package ClasePadre;

//La superclase abstracta Empleado
public abstract class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    //Definir constructor con tres argumentos
    public Empleado(String nombre, String apellido, String ISSS) {

        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = ISSS;

    }//Fin del constructor de empleado con tres argumentos

    //establecer el primer nombre
    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    //devuelve el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    //establecer el segundo metodo que establece el apellido paterno
    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    //devuelve el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    //Establece el numero social de seguro social
    public void establecerNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss;

    }

    //Devuelve el numero de seguro social
    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // devuelve representacion String de un objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s\nnumero de seguro social: %s",
                obtenerPrimerNombre(),
                obtenerApellidoPaterno(),
                obtenerNumeroSeguroSocial());
    }

    //metodo abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); //aqui no hay implementacion
}
