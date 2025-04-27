package c12_arreglos;

import java.util.Arrays;

public class EjemploArregloForInversoMutable {
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
        System.out.println("========= Usando For ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("========= Usando Mutable ==========");
        for(int i = 0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total -1 - i];
            productos[i] = inverso;
            productos[total -1 - i] = actual;
        }

        System.out.println("========= Imprimiendo a la Inversa ==========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
