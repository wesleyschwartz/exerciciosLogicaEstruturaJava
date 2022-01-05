package condicional;

import java.util.Scanner;

/**
 * Problema "coordenadas" (adaptado de URI 1041) Leia os valores das coordenadas
 * X e Y de um ponto no plano cartesiano. A seguir, determine qual o quadrante
 * ao qual pertence o ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem,
 * escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
 * “Eixo X” ou “Eixo Y”, conforme for a situação.
 *
 * @author wesle
 */
class Coordenadas {

    void calcCoordenadas() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        Integer x = ler.nextInt();
        System.out.println("Digite o valor de y");
        Integer y = ler.nextInt();
        String quadrante="";
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
        System.out.println(quadrante);
    }

}

