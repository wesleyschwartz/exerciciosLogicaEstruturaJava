package condicional;

import java.util.Scanner;

/**
 * Problema "operadora" Uma operadora de telefonia cobra R$ 50.00 por um plano
 * básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a
 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser
 * pago.
 *
 * @author wesle
 */
class Operadora {

    void calcOperadora() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quantos minutos foram usados de telefone");
        Double min = ler.nextDouble();
        double valor=0;
        if (min <= 100 && min >= 0) {
            valor = 50;
        } else if (min > 100) {
            valor = (min - 100) * 2 + 50;
        } else {
            System.out.println("Valor inválido");
        }
        System.out.println("o valor a ser pago pela quantidade de minutos de: " + min + " é de  R$" + valor);
    }
}
