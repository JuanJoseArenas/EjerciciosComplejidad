package Ejercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PomekonCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int casos = scanner.nextInt();
        scanner.nextLine();
        
        Set<String> listaPokemon = new HashSet<>();
        
        for (int i = 0; i < casos; i++) {
            String nombrePokemon = scanner.nextLine().toUpperCase();
            listaPokemon.add(nombrePokemon);
        }

        int totalPokemones = 151;
        int capturadosUnicos = listaPokemon.size();
        int faltantes = totalPokemones - capturadosUnicos;
        
        System.out.printf("Falta(m) %d pomekon(s).\n", faltantes);
        
        scanner.close();
    }
}

