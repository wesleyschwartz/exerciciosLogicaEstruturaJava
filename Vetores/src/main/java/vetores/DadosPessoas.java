package vetores;

import java.util.Scanner;

/**
 * Problema "dados_pessoas" Tem-se um conjunto de dados contendo a altura e o
 * gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e
 * a menor altura do grupo, a média de altura das mulheres, e o número de
 * homens.
 *
 * @author wesle
 */
class DadosPessoas {

    void metDadosPessoas(Scanner in) {
        System.out.println("Quantas pessoas serão registradas?");
        Integer n = in.nextInt();
        Double[] altura = new Double[n];
        String sexo = "";
        int homem = 0, mulher = 0;
        double altMulher = 0D, menorAltura = 0D, maiorAltura = 0D;
        for (int i = 0; i < n; i++) {
            System.out.println("Escreva a altura");
            altura[i] = in.nextDouble();
            System.out.println("H para homem, se não M");
            sexo = in.next();
            if (sexo.equalsIgnoreCase("H")) {
                homem++;
            } else {
                mulher++;
                altMulher = (altura[i] + altMulher);
            }
        }
        maiorAltura = altura[0];
        menorAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        double mediaAltMulher = altMulher / mulher;

        System.out.println(
                "A maior altura é  com " + maiorAltura);
        System.out.println(
                "A menor altura é com " + menorAltura);
        System.out.println(
                "A média de altura das mulher é " + mediaAltMulher);
        System.out.println(
                "A quantida de homens é " + homem);
    }
}
