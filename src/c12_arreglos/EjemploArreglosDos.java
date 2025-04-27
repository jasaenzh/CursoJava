package c12_arreglos;
import java.util.Arrays;

public class EjemploArreglosDos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Kings Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String product1 = productos[0];
        String product2 = productos[1];
        String product3 = productos[2];
        String product4 = productos[3];
        String product5 = productos[4];
        String product6 = productos[5];
        String product7 = productos[6];

        System.out.println("productos[0] = " + product1);
        System.out.println("productos[1] = " + product2);
        System.out.println("productos[2] = " + product3);
        System.out.println("productos[3] = " + product4);
        System.out.println("productos[4] = " + product5);
        System.out.println("productos[5] = " + product6);
        System.out.println("productos[6] = " + product7);

    }
}
