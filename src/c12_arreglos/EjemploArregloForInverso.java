package c12_arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArregloForInverso {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Kings Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("========= Usando For ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("========= Usando For Inverso ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " +  (total - 1 - i) + " : " + productos[total - 1 - i]);
        }

        System.out.println("========= Usando For Inverso2 ==========");
        for(int i = total -1; i >= 0; i--){
            System.out.println("para indice " +  i + " : " + productos[i]);
        }

    }
}
