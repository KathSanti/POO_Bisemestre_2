package FormativaSemana2.App;

import FormativaSemana2.Model.Cliente;
import FormativaSemana2.Model.Direccion;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1       = new Direccion("Los Manzanos", "Santiago","2740","Chile");
        Cliente cliente1           = new Cliente("Xbox", "xboxchile@outlok.cl","+56220545685", direccion1);

        Direccion direccion2       = new Direccion ("Croc", "Chicago", "5401","Estados Unidos");
        Cliente cliente2           = new Cliente("PlayStation", "playstationchile@station.cl", "+5622785421", direccion2);

        Direccion direcion3        = new Direccion ("Animal Crossing", "Nagasaki", "5145","Japon");
        Cliente cliente3           = new Cliente ("Nintendo", "nintendoChile@nintendogoblal.com","+5622786875", direcion3);

        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                               PUERTO GAMES                                                                     ║");
        System.out.println("║                                                      Portal Administrativo Clientes                                                            ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Cliente       │ Correo                              │ Teléfono     │   Dirección                                                               ║");
        System.out.println("╠═══════════════╪═════════════════════════════════════╪══════════════╪═══════════════════════════════════════════════════════════════════════════╣");

        Cliente[] arregloClientes = {cliente1,cliente2,cliente3};
        for (int i = 0; i <arregloClientes.length; i++){
            System.out.println(arregloClientes[i].toString());
        }

        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");






    }
}
