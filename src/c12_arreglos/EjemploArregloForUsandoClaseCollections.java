package c12_arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloForUsandoClaseCollections {
    public static void main(String[] args) {
        String[] productos = {
                "Kings Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta Generación",
                "Bicicleta Oxford"
        };

        int total = productos.length;


        Arrays.sort(productos);
        // Usando Clase Collections y el Metodo reverse, este recibe una lista por ende debemos de convertir tambien el arreglo en una lista con el metodo asList
        Collections.reverse(Arrays.asList(productos));

        System.out.println("========= Usando For ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }
}
