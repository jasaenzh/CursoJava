package c12_arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
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

        int contador = productos.length;

        // Usando for
        System.out.println("");
        System.out.println("Usando For");
        for(int i = 0; i < contador; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        // Usando foreach
        System.out.println("");
        System.out.println("Usando ForEach");
        for(String producto : productos){
            System.out.println("producto: " + producto);
        }
    }
}
