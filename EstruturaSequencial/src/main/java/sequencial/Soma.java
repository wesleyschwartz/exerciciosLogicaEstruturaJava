package sequencial;
/*
Problema "soma" 
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes 
números. 

*/

import java.util.Scanner;

class Soma {
    public void calcSoma(){
    Scanner ler = new Scanner(System.in);
    Integer[] numero = new Integer[2];
    Integer soma;
        System.out.println("Digite o primeiro numero");
        numero[0] = ler.nextInt();
        System.out.println("Digite o segundo numero");
        numero[1] = ler.nextInt();
        soma = (numero [0] + numero[1]);
        System.out.println("a soma dos valores é " + soma);
    }
}
