package repetitivas;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
 * serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
 * este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. No caso
 * do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.
 *
 * @author wesle
 */
class ParImpar {

    void calcParImpar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        Integer n = ler.nextInt();
        Integer x;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número para analisar");
            x = ler.nextInt();
            if (x % 2 != 0 && x > 0) {
                System.out.println("IMPAR POSITIVO");
            } else if (x % 2 != 0 && x < 0) {
                System.out.println("IMPAR NEGATIVO");
            } else if (x % 2 == 0 && x > 0) {
                System.out.println("PAR POSITIVO");
            } else if (x % 2 == 0 && x < 0) {
                System.out.println("PAR NEGATIVO");
            } else {
                System.out.println("NULO");
            }
        }
    }
}
