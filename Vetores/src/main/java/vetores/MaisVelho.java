package vetores;

import java.util.Scanner;

/**
 * Problema "mais_velho" Fazer um programa para ler um conjunto de nomes de
 * pessoas e suas respectivas idades. Os nomes devem ser armazenados em um
 * vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da
 * pessoa mais velha.
 *
 * @author wesle
 */
class MaisVelho {

    void metMaisVelho(Scanner in) {
        System.out.println("Digite quantas pessoas deseja registrar!");
        Integer n = in.nextInt();
        String[] nome = new String[n + 1];
        Integer[] idade = new Integer[n + 1];
        Integer x = 0;
        String xnome = "";
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Digite o nome do " + i + "ª indivíduo");
            nome[i] = in.next();
            System.out.println("Digite a idade do(a) " + nome[i]);
            idade[i] = in.nextInt();
            if (idade[i] > x) {
                x = idade[i];
                xnome = nome[i];
            }
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.println("\nNome: " + nome[i]
                    + "\n Idade: " + idade[i]);
        }
        System.out.println("\n" + xnome + " é mais velho com " + x + " anos.");
    }
}
