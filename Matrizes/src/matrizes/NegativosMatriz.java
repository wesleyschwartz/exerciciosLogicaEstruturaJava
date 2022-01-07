package matrizes;

import java.util.Scanner;

/**
 * Problema "negativos_matriz" Ler dois números M e N (máximo = 10), e depois
 * ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
 * na tela somente os números negativos da matriz.
 *
 * @author wesley
 */
class NegativosMatriz {

    void metodoNegativosMatriz(Scanner ler) {
        System.out.println("Qual a quantidade de linhas?");
        int m = ler.nextInt();
        System.out.println("Qual a quantidade colunas?");
        int n = ler.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                mat[i][j] = ler.nextInt();
            }
        }
        System.out.println("Os negativos são: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.print("\n" + mat[i][j]);
                }
            }
        }
    }
}
