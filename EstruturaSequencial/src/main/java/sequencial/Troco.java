package sequencial;
/*
Problema "troco" 
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
mostrar o valor do troco a ser devolvido ao cliente. 
*/

import java.util.Scanner;

class Troco {

    public void calcTroco() {
        Scanner ler = new Scanner(System.in);
        Float troco;
        Integer qtd;
        Float pagamento;
        Float precouni;
        System.out.println("Digite o preço unitario do produto");
        precouni = ler.nextFloat();
        System.out.println("Digite a quantidade produtos");
        qtd = ler.nextInt();
        System.out.println("Digite o valor a ser pago");
        pagamento = ler.nextFloat();
        troco = pagamento - (qtd*precouni);
        System.out.println("O troco é R$"+ troco);
    }

}
