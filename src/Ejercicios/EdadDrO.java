package Ejercicios;

import java.util.Scanner;

public class EdadDrO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la entrada
        int edadDrO = scanner.nextInt();
        int edadAlyssa = scanner.nextInt();
        int edadKonari = scanner.nextInt();

        // Encontrar si existen a y k positivos
        int result = findAK(edadDrO, edadAlyssa, edadKonari);

        // Imprimir el resultado
        System.out.println(result);

        scanner.close();
    }

    private static int findAK(int edadDrO, int edadAlyssa, int edadKonari) {
        // Iterar sobre posibles valores de a
        for (int a = 1; a <= edadDrO / edadAlyssa; a++) {
            // Calcular el residuo después de restar a veces la edad de Alyssa
            int remainder = edadDrO - a * edadAlyssa;

            // Verificar si el residuo es positivo y divisible por la edad de Konari
            if (remainder > 0 && remainder % edadKonari == 0) {
                int k = remainder / edadKonari;

                // Si k es positivo, retornar 1
                if (k > 0) {
                    return 1;
                }
            }
        }
        // Si no se encuentra ningún par válido de a y k, retornar 0
        return 0;
    }
}
