package FormativaSemana2.Model;

public class Direccion {

    /**
     * Representa la información de la dirección fisica de un cliente
     *
     */

    private String calle;
    private String numero;
    private String ciudad;
    private String pais;

    /**
     * Constructor para crear instancia de la dirección de un cliente
     *
     * @param calle   Nombre de la calle dirección
     * @param ciudad  Nombre de la ciudad dirección
     * @param numero  Número de la dirección
     * @param pais    Nombre del país dirección
     */

    public Direccion(String calle, String ciudad, String numero, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
