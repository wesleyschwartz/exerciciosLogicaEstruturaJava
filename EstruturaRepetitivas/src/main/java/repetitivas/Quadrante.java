package repetitivas;

import java.util.Scanner;

/**
 * Problema "quadrante" (adaptado de URI 1115) Escreva um programa para ler as
 * coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2,
 * Q3 ou Q4). O algoritmo será encerrado quando pelo menos uma de duas
 * coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 *
 * @author wesle
 */
class Quadrante {

    void calcQuadrante() {
        Scanner ler = new Scanner(System.in);
        String sx;
        String sy;
        System.out.println("Digite o valor de x");
        sx = ler.nextLine();
        System.out.println("Digite o valor de y");
        sy = ler.nextLine();
        String quadrante = "";
        while (!sy.isEmpty() && !sx.isEmpty()) {
            Integer x = Integer.parseInt(sx);
            Integer y = Integer.parseInt(sy);
            if (x > 0 && y > 0) {
                quadrante = "Q1";
            } else if (x < 0 && y > 0) {
                quadrante = "Q2";
            } else if (x < 0 && y < 0) {
                quadrante = "Q3";
            } else if (x > 0 && y < 0) {
                quadrante = "Q4";
            } else if (x == 0 && y == 0) {
                quadrante = "Origem";
            } else if (x == 0) {
                quadrante = "Eixo Y";
            } else if (y == 0) {
                quadrante = "Eixo X";
            }
            System.out.println("QUADRANTE : " + quadrante);
            System.out.println("Digite o valor de x. OBS, para encerrar deixe x e/ou y vazios");
            sx = ler.nextLine();
            System.out.println("Digite o valor de y. OBS, para encerrar deixe x e/ou y vazios");
            sy = ler.nextLine();
        }
    }
}
