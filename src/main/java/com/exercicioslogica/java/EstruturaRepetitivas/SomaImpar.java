package repetitivas;

import java.util.Scanner;

/**
 * Problema "soma_impares" (adaptado de URI 1071) Leia 2 valores inteiros X e Y
 * (em qualquer ordem). A seguir, calcule e mostre a soma dos números impares
 * entre eles.
 *
 * @author wesle
 */
class SomaImpar {

    void calcSomaImpar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        Integer x = ler.nextInt();
        System.out.println("Digite o segundo valor");
        Integer y = ler.nextInt();
        Integer troca;
        Integer soma;
        soma = 0;
        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }
        for (int i = x + 1; i <= y - 1; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("A soma dos numeros impares de " + x + " até " + y + " é de : " + soma);
    }
}
