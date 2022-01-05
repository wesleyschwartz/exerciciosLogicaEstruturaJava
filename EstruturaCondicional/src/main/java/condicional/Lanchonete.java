package condicional;

import java.util.Scanner;

/**
 * Problema "lanchonete" Uma lanchonete possui vários produtos. Cada produto
 * possui um código e um preço. Você deve fazer um programa para ler o código e
 * a quantidade comprada de um produto (suponha um código válido), e daí
 * informar qual o valor a ser pago, com duas casas decimais, conforme tabela de
 * produtos ao lado. Código do produto |Preço do produto 1 |R$ 5.00 2 |R$ 3.50 3
 * |R$ 4.80 4 |R$ 8.90 5 |R$ 7.32
 *
 * @author wesle
 */
class Lanchonete {

    void calcLanchonete() {
        Scanner ler = new Scanner(System.in);
        Double produto1, produto2, produto3, produto4, produto5;

        System.out.println("Informe de 1  a 5 para informar o produto ");
        Integer produtox = ler.nextInt();

        System.out.println("Informe a quantidade do produto");
        Integer qtd = ler.nextInt();
        double valor = 0;
        if (produtox == 1) {
            produto1 = 5.00;
            System.out.println("Informe a quantidade do produto");
            valor = produto1 * qtd;
        } else if (produtox == 2) {
            produto2 = 3.50;
            valor = produto2 * qtd;
        } else if (produtox == 3) {
            produto3 = 4.80;
            valor = produto3 * qtd;
        } else if (produtox == 4) {
            produto4 = 8.90;
            valor = produto4 * qtd;
        } else if (produtox == 5) {
            produto5 = 7.32;
            valor = produto5 * qtd;
        } else {
            System.out.println("Produto não encontrado");
        }
        System.out.println("O valor é a ser pago é: R$ " + valor);
    }
}

