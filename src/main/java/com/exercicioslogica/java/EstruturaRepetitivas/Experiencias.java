package repetitivas;

import java.util.Scanner;

/**
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
 * precisa de sua ajuda para organizar os experimentos de um laboratório o qual
 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
 * coelhos. Para obter estas informações, ela sabe exatamente o número de
 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
 * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
 * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
 * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
 * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
 * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
 * o ponto.
 *
 * @author wesle
 */
class Experiencias {

    void calcExp() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos experimentos foram realizados??");
        Integer n = ler.nextInt();
        Integer C = 0, R = 0, S = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Qual tipo de cobaia deseja registrar?"
                    + "+\n C->coelho \t R->rato \t S->sapo");
            String tipo = ler.next();
            if (tipo.equalsIgnoreCase("C")) {
                System.out.println("Quantas coelhos foram feitas de cobaia?");
                C = C + ler.nextInt();
            } else if (tipo.equalsIgnoreCase("R")) {
                System.out.println("Quantos ratos foram feitos de cobaia?");
                R = R + ler.nextInt();
            } else if (tipo.equalsIgnoreCase("s")) {
                System.out.println("Quantos sapos foram feitos de cobaia?");
                S = S + ler.nextInt();
            } else {
                System.out.println("Nada registrado...Por favor insira a letra certa.");
            }
        }
        int total = C + R + S;
        System.out.println("RELATORIO FINAL: "
                + "\n Total: " + total
                + "\n Coelhos: " + C
                + "\n Ratos: " + R
                + "\n Sapos: " + S);

        C = (C*100) / total;
        R = (R*100) / total;
        S = (S*100) / total;
        System.out.println("\n Total: "
                + "\n Porcentagem Coelhos: " + C + " %"
                + "\n Porcentagem Ratos: " + R + " %"
                + "\n Porcentagem Sapos: " + S + " %");
    }

}
