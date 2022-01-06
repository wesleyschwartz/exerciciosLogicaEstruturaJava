package vetores;

import java.util.Scanner;

/**
 * Problema "dados_pessoas" Tem-se um conjunto de dados contendo a altura e o
 * gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e
 * a menor altura do grupo, a média de altura das mulheres, e o número de
 * homens.
 *
 *
 * @author wesle
 */
class DadosPessoas {

    void metDadosPessoas() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas pessoas serão registradas?");
        Integer n = in.nextInt();
        Double[] alt = new Double[n + 1];
        Double altm = 0D;
        Double altguardarmaior = 0D, altguardarmenor = 0D;
        String genero = "";
        String nomeguardarmenor = "", nomeguardarmaior = "";
        Integer h = 0, m = 0;
        String[] nome = new String[n + 1];
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Qual o nome da " + i + "ª pessoa?");
            nome[i] = in.next();
            System.out.println("Digite a altura de " + nome[i]);
            alt[i] = in.nextDouble();
            if (altguardarmenor < alt[i]) {
                altguardarmenor = alt[i];
                nomeguardarmenor = nome[i];
            } else {
                altguardarmaior = alt[i];
                nomeguardarmaior = nome[i];
            }
            System.out.println("Se é homem digite H, se não M");
            genero = in.next();
            if (genero.equalsIgnoreCase("h")) {
                h++;
            } else {
                m++;
                altm = (alt[i] + altm) / m;
            }
        }
        System.out.println(
                "O maior é " + nomeguardarmaior + " com " + altguardarmaior + "m");
        System.out.println(
                "O menor é " + nomeguardarmenor + " com " + altguardarmenor + "m");
        System.out.println(
                "Nesse grupo há: " + h + " homens");
        System.out.println(
                "A media de altura das mulheres é: " + altm);
    }
}
