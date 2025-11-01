package FormativaSemana2.App;

import FormativaSemana2.Model.Cliente;
import FormativaSemana2.Model.Direccion;

/**
 *  Clase  principal que ejecuta el uso de las clases Cliente y Dirección para PuertoGames
 *  Se crean intancias de clientes y su dirección de cliente mostrando la información en una tabla
 *
 * @see Cliente
 * @see Direccion
 *
 */

public class Main {

    /**
     * Metodo principal donde se objetos de clientes y sus direcciones
     * para imprimir la información en una tabla.
     *
     */

    public static void main(String[] args) {


        //Crear direcciones por clientes

        Direccion direccion1       = new Direccion ("Los Manzanos", "Santiago","2740","Chile");
        Direccion direccion2       = new Direccion ("Croc", "Chicago", "5401","Estados Unidos");
        Direccion direccion3        = new Direccion ("Animal Crossing", "Nagasaki", "5145","Japon");

        //Crear clientes

        Cliente cliente1           = new Cliente ("Xbox", "xboxchile@outlook.cl","+56220545685", direccion1);
        Cliente cliente2           = new Cliente ("PlayStation", "playstationchile@station.cl", "+5622785421", direccion2);
        Cliente cliente3           = new Cliente ("Nintendo", "nintendoChile@nintendogoblal.com","+5622786875", direccion3);


        //Encabezado tabla
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                               PUERTO GAMES                                                                     ║");
        System.out.println("║                                                      Portal Administrativo Clientes                                                            ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Cliente       │ Correo                              │ Teléfono     │   Dirección                                                               ║");
        System.out.println("╠═══════════════╪═════════════════════════════════════╪══════════════╪═══════════════════════════════════════════════════════════════════════════╣");


        //Arreglo para mostrar clientes por posiención en Tabla
        Cliente[] arregloClientes = {cliente1,cliente2,cliente3};
        for (int i = 0; i <arregloClientes.length; i++){
            System.out.println(arregloClientes[i].toString());
        }

        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");






    }
}
