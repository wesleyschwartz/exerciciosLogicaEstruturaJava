package matrizes;

import java.util.Scanner;

/**
 * Problema "cada_linha" Ler um inteiro N e uma matriz quadrada de ordem N
 * (máximo = 10). Mostrar qual o maior elemento de cada linha. Suponha não haver
 * empates.
 *
 * @author wesley
 */
class CadaLinhaMatriz {

    void metodoCadaLinha(Scanner ler) {
        System.out.println("Qual a ordem da matriz?");
        int m = ler.nextInt();
        int[][] mat = new int[m][m];
        int x[] = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                mat[i][j] = ler.nextInt();
                if (x[i] < mat[i][j]) {
                    x[i] = mat[i][j];
                }
            }
        }
        System.out.println("O maior número de cada linha é");
        for (int i = 0; i < m; i++) {
            System.out.print("\t |Linha " + i + " -> " + x[i] );
        }
    }

}
