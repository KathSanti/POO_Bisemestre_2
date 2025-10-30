package FormativaSemana2.Model;

public class Cliente {

    private String nombre;
    private String correo;
    private String telefono;
    private Direccion direccion;

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

    public String getTelfonos(){
        return telefono;
    }

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

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("║ %-13s │ %-35s │ %-12s │ %-73s ║",
                nombre,
                correo,
                telefono,
                direccion.toString().replace("Direccion{", "").replace("}", ""));
    }



}
