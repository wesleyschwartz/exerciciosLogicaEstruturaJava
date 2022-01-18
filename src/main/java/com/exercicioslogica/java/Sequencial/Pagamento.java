package sequencial;
/*
Problema "pagamento" 
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a 
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com 
uma mensagem explicativa, conforme exemplo

*/

import java.util.Scanner;

class Pagamento {

    void calcPagamento() {
        //Fazer um programa para ler o nome de um(a) funcionário(a)
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = ler.nextLine();
        //o valor que ele(a) recebe por hora
        System.out.println("Digite quanto " + nome + " recebe por hora: ");
        Double recebeh = ler.nextDouble();
        //e a quantidade de horas trabalhadas por ele(a)
        System.out.println("Digite quantas horas " + nome + " trabalhou");
        Double qtdh = ler.nextDouble();
        //mostrar o valor do pagamento do funcionário com uma mensagem explicativa
        Double valorpagamento =  recebeh * qtdh;
        System.out.println("Nome:" + nome
                + "\n Valor por hora: " + recebeh
                + "\n Horas trabalhadas: " + qtdh
                + "\n O pagamento do " + nome + " é R$" + valorpagamento);

    }

}
