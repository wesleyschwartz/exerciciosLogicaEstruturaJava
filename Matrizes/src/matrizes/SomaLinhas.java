package matrizes;

import java.util.Scanner;

/**
 * Problema "soma_linhas" Fazer um programa para ler dois números inteiros M e N
 * (máximo = 10). Em seguida, ler uma matriz de M linhas e N colunas contendo
 * números reais. Gerar um vetor de modo que cada elemento do vetor seja a soma
 * dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
 *
 * @author wesley
 */
class SomaLinhas {

    void metodoSomaLinhas(Scanner ler) {

        System.out.println("Qual a quantidade de linhas?");
        int m = ler.nextInt();
        System.out.println("Qual a quantidade colunas?");
        int n = ler.nextInt();
        double[][] mat = new double[m][n];
        double[] soma = new double[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Digite os elementos da linha " + (i+1));
            for (int j = 0; j < n; j++) {
                mat[i][j] = ler.nextInt();
                soma[i] = mat[i][j] + soma[i];
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println("A soma da linha " + (i+1) + " é " + soma[i]);
        }
    }
}
