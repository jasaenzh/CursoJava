package c12_arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloForOrdenamientoBurbuja {
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
        int contador = 0;

        for(int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador = contador + 1;
            }
        }

        System.out.println("contador = " + contador);

        System.out.println("========= Imprimiendo Arreglo ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }
}
