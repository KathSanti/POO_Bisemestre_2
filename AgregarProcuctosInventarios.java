public class AgregarProcuctosInventarios {

    public static void main(String[] args) {

        //Crear objetos en mi clase main
        ProductoAgricola producto1 = new ProductoAgricola("Aceitunas",101,0.5, false);
        ProductoAgricola producto2 = new ProductoAgricola("Zanahoria",102,50,true);
        ProductoAgricola producto3 = new ProductoAgricola("Lechuga",103,100,true);


        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                INVENTARIO COOPERATIVA AGRICOLA             ║");
        System.out.println("║                         RAÍCES DEL SUR                     ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ ID  │ PRODUCTO     │ PRECIO/KG   │        EXPORTACIÓN      ║");
        System.out.println("╠═════╪══════════════╪═════════════╪═════════════════════════╣");

        ProductoAgricola[] productos = {producto1,producto2,producto3};
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("║ %-2d │ %-12s │ $%-10.2f │ %-23s ║%n",

                    productos[i].getId(),
                    productos[i].getNombre(),
                    productos[i].getPrecioxKilo(),
                    productos[i].isDisponiblesExportacion() ? "Sí" : "No");
        }

    }
}
