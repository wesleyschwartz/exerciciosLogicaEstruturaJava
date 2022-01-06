package vetores;
import java.util.Scanner;
/**
 * Problema "soma_vetores" Faça um programa para ler dois vetores A e B,
 * contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada
 * elemento de C é a soma dos elementos correspondentes de A e B. Imprima o
 * vetor C gerado.
 *
 * @author wesle
 */
class SomaVetores {
    void metSomaVetores(Scanner in) {
        System.out.println("Digite o tamanho do vetor");
        Integer n = in.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os números do vetor A");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os números do vetor B");
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }System.out.println("Os valores do vetor C serão");
        for (int i = 0; i < n; i++) {
             System.out.print("\t"+c[i]);
        }
    }
}
