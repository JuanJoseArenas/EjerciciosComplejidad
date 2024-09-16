package Ejercicios;

import java.util.Scanner;

public class Diagonals {

    public static int[] calcularDiagonalesOcupadas(int cantidadCasos, int[][] casosDePrueba) {
        int[] resultados = new int[cantidadCasos];

        for (int i = 0; i < cantidadCasos; i++) {
            int tamanoTablero = casosDePrueba[i][0];
            int numeroFichas = casosDePrueba[i][1];

            if (numeroFichas == 0) {
                resultados[i] = 0;
                continue;
            }

            int diagonalesOcupadas = 0;
            int fichasRestantes = numeroFichas;

            for (int longitudDiagonal = tamanoTablero; longitudDiagonal > 0; longitudDiagonal--) {
                if (fichasRestantes <= 0) {
                    break;
                }
                if (longitudDiagonal == tamanoTablero) {
                    diagonalesOcupadas++;
                    fichasRestantes -= tamanoTablero;
                } else {
                    if (fichasRestantes > 0) {
                        diagonalesOcupadas++;
                        fichasRestantes -= longitudDiagonal;
                    }
                    if (fichasRestantes > 0) {
                        diagonalesOcupadas++;
                        fichasRestantes -= longitudDiagonal;
                    }
                }
            }

            resultados[i] = diagonalesOcupadas;
        }

        return resultados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadCasos = scanner.nextInt();
        int[][] casosDePrueba = new int[cantidadCasos][2];

        for (int i = 0; i < cantidadCasos; i++) {
            int tamanoTablero = scanner.nextInt();
            int numeroFichas = scanner.nextInt();
            casosDePrueba[i] = new int[]{tamanoTablero, numeroFichas};
        }

        int[] resultados = calcularDiagonalesOcupadas(cantidadCasos, casosDePrueba);

        for (int resultado : resultados) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}