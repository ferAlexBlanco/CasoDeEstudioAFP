package ClasePadre;

//La superclase abstracta Empleado
public abstract class CuentaAFP {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private String numeroIdentificacion;
    private String estadoDeCuenta;
    private String aportesRealizado;

    //Definir constructor con tres argumentos
    public CuentaAFP(String nombre, String apellido, String ISSS, String DUI, String EstadoDeCuenta, String aportesRealizados) {

        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = ISSS;
        numeroIdentificacion = DUI;
        estadoDeCuenta = EstadoDeCuenta;
        aportesRealizados = aportesRealizados;

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

    public void establecerNumeroIdentificacion(String DUI) {
        numeroIdentificacion = DUI;

    }

    public String obtenerNumeroIdentificacion() {
        return numeroIdentificacion;

    }

    public void establecerEstadoDeCuenta(String EstadoDeCuenta) {
        estadoDeCuenta = EstadoDeCuenta;

    }

    public String obtenerEstadoDeCuenta() {
        return estadoDeCuenta;

    }

    // devuelve representacion String de un objeto Empleado
    @Override
    public String toString() {
        System.out.println("Afiliados\n");
        System.out.println("Numero de dui: " + obtenerNumeroIdentificacion());
        System.out.println("Estado de cuenta: " + obtenerEstadoDeCuenta());

        return String.format("%s %s\nNumero de seguro social: %s",
                obtenerPrimerNombre(),
                obtenerApellidoPaterno(),
                obtenerNumeroSeguroSocial()
        );
    }

    //metodo abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); //aqui no hay implementacion
}
