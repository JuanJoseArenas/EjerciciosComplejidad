package Ejercicios;
import java.util.Scanner;

public class AlphabeticalAthletes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombres = scanner.nextLine();

        nombres = nombres.toUpperCase();

        if (Ascendente(nombres) || Descendente(nombres)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }

    public static boolean Descendente(String nombre) {
        for (int i = 0; i < nombre.length() - 1; i++) {
            if (nombre.charAt(i) < nombre.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
    
    public static boolean Ascendente(String nombre) {
        for (int i = 0; i < nombre.length() - 1; i++) {
            if (nombre.charAt(i) > nombre.charAt(i + 1)) {
                return false;
            }

        }
        return true;

    }

}

