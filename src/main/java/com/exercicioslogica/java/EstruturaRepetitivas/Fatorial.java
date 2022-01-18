package repetitivas;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número natural N (valor máximo: 15), e depois
 * calcular e mostrar o fatorial de N.
 *
 * @author wesle
 */
class Fatorial {

    void calcFatorial() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual numero deseja fatorar?");
        Integer n = ler.nextInt();
        Long x = 1L;
        for (long i = n; i > 0; i--) {
            x = x * i;
        }
        System.out.println("Fatorial é " + x);
    }

}
