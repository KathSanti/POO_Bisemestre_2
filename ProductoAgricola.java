public class ProductoAgricola {

    //Encapsulación
    private String nombre;
    private int id;
    private double precioxKilo;
    private boolean disponiblesExportacion;

    //Constructor sin parametros
    public ProductoAgricola() {
    }

    //Constructor con parámetros inicializados
    public ProductoAgricola(String nombre, int id, double precioxKilo, boolean disponiblesExportacion) {
        this.nombre = nombre;
        this.id = id;
        this.precioxKilo = precioxKilo;
        this.disponiblesExportacion = disponiblesExportacion;

    }


    //Metodos publicos accesores y mutadores de todos mis atributos

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getPrecioxKilo() {
        return precioxKilo;
    }

    public boolean isDisponiblesExportacion() {
        return disponiblesExportacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecioxKilo(double precioxKilo) {
        this.precioxKilo = precioxKilo;
    }

    public void setDisponiblesExportacion(boolean disponiblesExportacion) {
        this.disponiblesExportacion = disponiblesExportacion;
    }

    @Override
    public String toString() {
        return "ProductoAgricola{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", precioxKilo=" + precioxKilo +
                ", disponiblesExportacion=" + disponiblesExportacion +
                '}';
    }
}
