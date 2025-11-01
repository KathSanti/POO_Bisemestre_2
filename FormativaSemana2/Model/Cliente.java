package FormativaSemana2.Model;


/**
 * Se representa la información de un cliente
 * Maneja atributos con datos de contacto y de dirección
 *
 * @author Katherine Santibáñez
 */

public class Cliente {


    private String nombre;
    private String correo;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor para crear una instancia de Cliente
     * @param nombre       Nombre del Cliente
     * @param correo       Correo del Cliente
     * @param telefono     Número de teléfono del cliente
     * @param direccion    Dirección fisica del cliente bajo el objeto Dirección
     */

    public Cliente(String nombre, String correo, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono(){
        return telefono;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return Objeto Direccion con la dirección del cliente
     */

    public Direccion getDireccion(){
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void  setCorreo(String correo){
        this.correo = correo;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion Nueva dirección del cliente
     */

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }


    /**
     * Retorna una representación en formato String del cliente.
     * El formato está diseñado para mostrarse en una tabla.
     *
     * @return String formateado con los datos del cliente
     */

    @Override
    public String toString() {
        return String.format("║ %-13s │ %-35s │ %-12s │ %-73s ║",
                nombre,
                correo,
                telefono,
                direccion.toString().replace("Direccion{", "").replace("}", ""));
    }



}
