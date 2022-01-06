package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
 * abaixo da média, com uma casa decimal cada.
 *
 * @author wesle
 */
class AbaixoMedia {

    void metAbaixoMedia(Scanner in) {
        Locale.setDefault(Locale.US);
        System.out.println("Digite o tamanho dos vetores");
        Integer n = in.nextInt();
        Double[] a = new Double[n];
        Double media = 0D, soma = 0D;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os números do vetor");
            a[i] = in.nextDouble();
            soma = (a[i] + soma);
            media = soma / n;
        }
        System.out.println("A média é: " + String.format("%.3f", (media)));
        System.out.println("Elementos abaixo da média");
        for (int i = 0; i < n; i++) {
            if (a[i] < media) {
                System.out.print("\t" + a[i]);
            }
        }
    }
}
