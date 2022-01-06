package vetores;

import java.util.Scanner;

/**
 * Problema "soma_vetor" Faça um programa que leia N números reais e armazene-os
 * em um vetor. Em seguida: - Imprimir todos os elementos do vetor - Mostrar na
 * tela a soma e a média dos elementos do veto
 *
 * @author wesle
 */
class SomaVetor {

    void metSomaVetor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números tu vai digitar?");
        Integer n, x, y = 0;
        n = in.nextInt(); 
        Integer[] vet = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            x = in.nextInt();
            vet[i] = x;
        }
        System.out.println("Os números são: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] != null) {
                System.out.print(vet[i] + " | ");
                y = vet[i] + y;
            }
        }
        System.out.println("\nA soma deles é: " + y
                + "\n Sua média é: " + y / n);
    }

}
