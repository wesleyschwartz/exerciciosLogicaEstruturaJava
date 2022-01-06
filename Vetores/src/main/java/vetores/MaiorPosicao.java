package vetores;

import java.util.Scanner;

/**
 * Problema "maior_posicao" Faça um programa que leia N números reais e
 * armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor
 * (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 *
 * @author wesle
 */
class MaiorPosicao {
    void metMaiorPosicao() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantida de números");
        Integer n = in.nextInt();
        Integer[] vet = new Integer[n];
        Integer x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número para comparar");
            vet[i] = in.nextInt();
            if (x < vet[i]) {
                x = vet[i];
                y = i;
            }
        }
        System.out.println("O maior valor é " + x
                + "\n E sua posição é:" + y);
    }
}
