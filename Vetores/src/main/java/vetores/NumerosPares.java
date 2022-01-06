package vetores;

import java.util.Scanner;

/**
 * Problema "numeros_pares" Faça um programa que leia N números inteiros e
 * armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e
 * também a quantidade de números pares.
 *
 * @author wesle
 */
class NumerosPares {

    void metNumerosPares(Scanner in) {
        System.out.println("Quantos números deseja verificar, se são ímpar ou par?");
        Integer n = in.nextInt();
        Integer[] x = new Integer[n];
        Integer arm = 0, par = 0;
        Integer[] vetpar = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            arm = in.nextInt();
            if (arm % 2 == 0) {
                vetpar[i] = arm;
                par++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (vetpar[i] != null) {
                System.out.println("O número " + vetpar[i] + " é par.");
            }
        }
        System.out.println("Sendo o total de números pares: " + par);
    }
}
