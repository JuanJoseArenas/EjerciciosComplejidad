package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LEDCalculator {
    public static void main(String[] args) {
        Map<Character, Integer> ledsPorNumero = new HashMap<>();
        ledsPorNumero.put('0', 6);
        ledsPorNumero.put('1', 2);
        ledsPorNumero.put('2', 5);
        ledsPorNumero.put('3', 5);
        ledsPorNumero.put('4', 4);
        ledsPorNumero.put('5', 5);
        ledsPorNumero.put('6', 6);
        ledsPorNumero.put('7', 3);
        ledsPorNumero.put('8', 7);
        ledsPorNumero.put('9', 6);

        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < casos; i++) {
            String input = scanner.nextLine();

            int ledsTotales = 0;
            for (char digito : input.toCharArray()) {
                if (Character.isDigit(digito)) {
                    ledsTotales += ledsPorNumero.getOrDefault(digito, 0);
                }
            }

            System.out.println(ledsTotales + " leds");
        }

        scanner.close();
    }
}