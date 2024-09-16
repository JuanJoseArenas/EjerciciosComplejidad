package Ejercicios;

import java.util.Scanner;
 
public class DaltonTheTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int casos = scanner.nextInt();
        
        // Procesar cada caso
        for (int i = 0; i < casos; i++) {
            // Leer el tamaño del array para este caso
            int n = scanner.nextInt();
            
            // Crear un array para guardar los elementos
            int[] array = new int[n];
            
            // Llenar el array con los elementos de la entrada
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            
            // Calcular el número de "infelices"
            int In = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == j + 1) {
                    In++;
                }
            }
            
            // Imprimir el resultado según el número de infelices
            if (In == 0) {
                System.out.println(0);  // Ningún infeliz, todos son felices
            } else {
                System.out.println(1 + (In - 1) / 2);  // Fórmula para calcular en base a infelices
            }
        }
        
        scanner.close();
    }
}
