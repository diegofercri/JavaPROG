import java.util.Scanner;

public class Ejer1 {
    /*
     * En un array de 20 elementos hay almacenados números enteros. Haz un
     * programa que pida un número y diga cuantas veces aparece el número dentro del
     * array.
     */
    public static void main(String[] args) throws Exception {
        int num[] = {1,2,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Introduce un numero y te dire cuantas veces se repite dentro de un array: ");
        Scanner numAnterior = new Scanner (System.in);
        int contador = 0;

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == numAnterior.nextInt()) {
                contador++;
            }
        }

        System.out.println("El numero se repite: " + contador + " veces.");
    
        numAnterior.close();
    }
}
