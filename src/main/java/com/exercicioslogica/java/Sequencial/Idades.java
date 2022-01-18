package sequencial;
/*
Problema "idades" 
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
*/

import java.util.Scanner;

public class Idades {

    public void mediaIdade() {
        Scanner ler = new Scanner(System.in);
        String[] nome = new String[2];
        Integer[] idade = new Integer[2];
        Integer media;
        System.out.println("Digite o nome da primeira pessoa");
        nome[0] = ler.nextLine();
        System.out.println("Digite o nome da segunda pessoa");
        nome[1] = ler.nextLine();

        System.out.println("Digite a idade de " + nome[0]);
        idade[0] = ler.nextInt();
        System.out.println("Digite a idade de " + nome[1]);
        int x = ler.nextInt();
        idade[1] = x;
        media = (idade[0] + idade[1]) / 2;

        System.out.println("A media de idade entre " + nome[0] + " e " + nome[1] + " é: " + media);

    }
}
