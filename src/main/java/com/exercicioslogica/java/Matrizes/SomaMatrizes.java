package matrizes;

import java.util.Scanner;

/**
 * Problema "soma_matrizes" Fazer um programa para ler duas matrizes de números
 * inteiros A e B, contendo de M linhas e N colunas cada (M e N máximo = 10).
 * Depois, gerar uma terceira matriz C onde cada elemento desta é a soma dos
 * elementos correspondentes das matrizes originais. Imprimir na tela a matriz
 * gerada.
 *
 * @author wesley
 */
class SomaMatrizes {

    void metodoSomaMatrizes(Scanner ler) {
        System.out.println("Qual a tamanho da linha");
        int m = ler.nextInt();
        System.out.println("Qual a tamanho da coluna?");
        int n = ler.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];
        System.out.println("Digite os elementos da matriz A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                A[i][j] = ler.nextInt();
            }
        }
        System.out.println("Digite os elementos da matriz B");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                B[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  |  " +C[i][j]+ "  |  ");
            }
            System.out.println("");
        }
    }
}
