package repetitivas;

import java.util.Scanner;

/**
 * Problema "tabuada" Ler um número inteiro N, daí mostrar na tela a tabuada de
 * N para 1 a 10, conforme exemplo.
 *
 * @author wesle
 */
class Tabuada {

    void calcTabuada() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Deseja a tabuada para qual valor?");
        Integer n = ler.nextInt();
        Integer x;
        for (int i = 0; i <= 10; i++) {
            x = n * i;
            System.out.println(n + " * " + i + " = " + x);
        }
    }
}
