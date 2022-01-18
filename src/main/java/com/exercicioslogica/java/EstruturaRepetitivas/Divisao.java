package repetitivas;

import java.util.Scanner;

/**
 * Problema "divisao" (adaptado de URI 1116) Escreva um algoritmo que leia dois
 * números e imprima o resultado da divisão do primeiro pelo segundo. Caso não
 * for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
 *
 * @author wesle
 */
class Divisao {

    void calcDivisao() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos casos voce vai digitar?");
        Integer n = ler.nextInt();
        Integer numerador, denominador, divisao;
        for (int i = 1; i <= n; i++) {
            System.out.println("Caso " + i);
            System.out.println("Digite o numerador");
            numerador = ler.nextInt();
            System.out.println("Digite o denominador");
            denominador = ler.nextInt();
            if (denominador == 0) {
                System.out.println("divisão impossível");
            } else {
                divisao = numerador / denominador;
                System.out.println("Resultado da divisão é : " + divisao);
            }
        }
    }
}
