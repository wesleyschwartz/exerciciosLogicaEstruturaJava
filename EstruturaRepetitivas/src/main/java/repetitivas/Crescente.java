package repetitivas;

import java.util.Scanner;

/**
 * Problema "crescente" (adaptado de URI 1113) Leia uma quantidade indeterminada
 * de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que
 * indique se estes valores foram digitados em ordem crescente ou decrescente. O
 * programa deve finalizar quando forem digitados dois valores iguais.
 *
 * @author wesle
 */
class Crescente {

    void calcCrescente() {
        Scanner ler = new Scanner(System.in);
        Integer x = 1;
        Integer y = 0;
        while (x != y) {
            System.out.println("Digite o valor de X, para sair digite X e Y iguais");
            x = ler.nextInt();
            System.out.println("Digite o valor de Y, para sair digite X e Y iguais");
            y = ler.nextInt();
            if (x > y) {
                System.out.println("deCRESCENTE");
            } else {
                System.out.println("CRESCENTE");
            }
        }
        System.out.println("While encerrado.");
    }
}
