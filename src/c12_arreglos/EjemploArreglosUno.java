package c12_arreglos;

public class EjemploArreglosUno {
    public static void main(String[] args) {

        // Creando arreglo con instancia y asignamos valores
        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int)3L;
        numeros[3] = -1;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
