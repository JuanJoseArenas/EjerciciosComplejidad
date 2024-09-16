package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class MontageMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n numero de personas
        //w numero de personas por fila
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] altura = new int[n];
        
        for (int i = 0; i < n; i++) {
            altura[i] = scanner.nextInt();
        }

        
        Arrays.sort(altura);

        boolean possible = true;
        for (int i = 0; i < n - w; i++) {
            if (altura[i] >= altura[i + w]) {
                possible = false;
                break;
            }
        }

        // Output the result
        if (possible) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}

