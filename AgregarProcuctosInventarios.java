public class AgregarProcuctosInventarios {

    public static void main(String[] args) {

        //Crear objetos en mi clase main
        ProductoAgricola producto1 = new ProductoAgricola("Aceitunas",101,500, false);
        ProductoAgricola producto2 = new ProductoAgricola("Zanahoria",102,700,true);
        ProductoAgricola producto3 = new ProductoAgricola("Lechuga",103,1000,true);


        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                INVENTARIO COOPERATIVA AGRICOLA             ║");
        System.out.println("║                         RAÍCES DEL SUR                     ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║ ID  │ PRODUCTO     │ PRECIO/KG   │        EXPORTACIÓN      ║");
        System.out.println("╠═════╪══════════════╪═════════════╪═════════════════════════╣");

        ProductoAgricola[] productos = {producto1,producto2,producto3};
        for (int i = 0; i < productos.length; i++) {
            //por cada posición en mi arreglo llamo al metodo to String para que me devuelva los datos ordenados y listos para mostrar
            System.out.println(productos[i].toString());

        }

    }
}
