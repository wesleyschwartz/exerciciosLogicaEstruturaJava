package matrizes;

import java.util.Scanner;

/**
 * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo
 * números inteiros. Mostrar a soma dos elementos acima da diagonal principal.
 * Um exemplo de números acima da diagonal principal é mostrado ao lado (no caso
 * as células com fundo cinza).
 *
 * @author wesley
 */
class AcimaDiagonal {

    void metodoAcimaDiagonal(Scanner ler) {
        System.out.println("Qual a ordem da matriz quadrada?");
        int n = ler.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                mat[i][j] = ler.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    soma = soma + mat[i][j];
                }
            }
        }
        System.out.println("A soma é dos números acima da diagonal principal é: " + soma);
    }
}
