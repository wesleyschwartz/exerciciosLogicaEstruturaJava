package matrizes;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N 
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores 
negativos da matriz. 

 * @author wesley

 */
public class DiagonalNegativos {

    void metodoMatrizGeral(Scanner ler) {
        System.out.println("Quantas linhas da matriz?");
        int m = ler.nextInt();
        System.out.println("Quantas colunas da matriz?");
        int n = ler.nextInt();
        int[][] mat = new int[m][n];
        int negativo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + " , " + j + "]");
                mat[i][j] = ler.nextInt();
                if (mat[i][j] < 0) {
                    negativo++;
                }
            }
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + mat[i][i]);
        }
        System.out.println("\nA quantidade de números neativos é: " + negativo);
    }
}
