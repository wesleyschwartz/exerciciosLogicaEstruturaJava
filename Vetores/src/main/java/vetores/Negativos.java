package vetores;
import java.util.Scanner;
/**
 * Problema "negativos" Faça um programa que leia um número inteiro positivo N
 * (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em
 * seguida, mostrar na tela todos os números negativos lidos.
 *
 *
 * @author wesle
 */
class Negativos {

    void metNegativos(Scanner ler) {
        System.out.println("Quantos números tu vai digitar?");
        Integer n, x;
        n = ler.nextInt();
        Integer[] vet = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            x = ler.nextInt();
            if (x < 0) {
                vet[i] = x;
            }
        }
         System.out.println("Os números negativos são: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] != null) {
                System.out.print(vet[i] + " | ");
            }
        }
    }
}
