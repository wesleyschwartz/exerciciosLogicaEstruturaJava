package matrizes;

import java.util.Scanner;

/**
 * Problema "matriz_geral" Ler uma matriz quadrada de ordem N (máximo = 10),
 * contendo números reais. Em seguida, fazer as seguintes ações: a) calcular e
 * imprimir a soma de todos os elementos positivos da matriz. b) fazer a leitura
 * do índice de uma linha da matriz e, daí, imprimir todos os elementos desta
 * linha. c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir
 * todos os elementos desta coluna. d) imprimir os elementos da diagonal
 * principal da matriz. e) alterar a matriz elevando ao quadrado todos os
 * números negativos da mesma. Em seguida imprimir a matriz alterada
 *
 * @author wesley
 */
class MatrizGeral {

    void metodoMatrizGeral(Scanner ler) {
        System.out.println("Qual a ordem da matriz quadrada?");
        int n = ler.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elemento [" + i + "]" + "[" + j + "]");
                mat[i][j] = ler.nextInt();
            }
        }
        int somaPosi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    somaPosi = somaPosi + mat[i][j];
                }
            }
        }
        System.out.println("A soma dos números positivos é: " + somaPosi);
        System.out.println("Escolha uma linha para mostrar");
        int nLinha = ler.nextInt();
        System.out.println("A linha " + nLinha + " é ");
        for (int j = 0; j < n; j++) {
            System.out.print("  |  " + mat[nLinha][j] + "  |  ");
        }
        System.out.println("\nEscolha uma coluna para mostrar");
        int nColuna = ler.nextInt();
        System.out.println("A coluna " + nColuna + " é ");
        for (int i = 0; i < n; i++) {
            System.out.println("|  " + mat[i][nColuna] + "  |  ");
        }
        System.out.println("A diagonal principal é :");
        for (int i = 0; i < n; i++) {
            System.out.print("  |  " + mat[i][i] + "  |  ");
        }
        double matAlterada[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    matAlterada[i][j] = mat[i][j];
                } else {
                    matAlterada[i][j] = (mat[i][j] * mat[i][j]);
                }
            }
        }
        System.out.println("\nA matriz alterada é\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  |  " + matAlterada[i][j] + "  |  ");
            }
            System.out.println("");
        }
    }
}
