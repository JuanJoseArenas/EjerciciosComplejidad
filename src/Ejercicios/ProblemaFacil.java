package Ejercicios;

import java.util.Scanner;

public class ProblemaFacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float s1 = scanner.nextFloat(); // numero de soluciones en la primera mitad
        float s2 = scanner.nextFloat(); // numero total de soluciones al final del curso

        // Verificar si el problema es considerado fácil, Si s1 es al menos la mitad de s2, entonces el problema es considerado fácil.
        if (s1 >= s2 / 2) {
            System.out.println("E");
        } else {
            System.out.println("H");
        }
        scanner.close();
    }
}

