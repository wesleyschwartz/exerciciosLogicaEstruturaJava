package vetores;

import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
 * pessoas caso houver.
 *
 * @author wesle
 */
class Alturas {

    void metAlturas() {
        Scanner in = new Scanner(System.in);
        Integer n = 0;
        System.out.println("Quantos pessoa serão inseridas");
        n = in.nextInt();
        Integer n2 = n + 1;
        String[] nome = new String[n2];
        Integer[] idade = new Integer[n2];
        Double[] altura = new Double[n2];
        Integer somaida = 0;
        Double somaAlt = 0D;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nome da " + i + "ª pessoa");
            nome[i] = in.next();
            System.out.println("Digite a idade de " + nome[i]);
            idade[i] = in.nextInt();
            if (idade[i] < 16) {
                somaida++;
            }
            System.out.println("Digite a altura de " + nome[i]);
            altura[i] = in.nextDouble();
            somaAlt = (altura[i] + somaAlt) / n;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("\tNome: " + nome[i]
                    + "\tAltura: " + altura[i]
                    + "\tIdade: " + idade[i]
            );
        }
        somaida = (100 * somaida) / n;
        System.out.println("Pessoas com menos de 16 anos é " + somaida + " % "
                + "\nA altura média dessas pessoas é de: " + somaAlt);
    }
}
