package com.exercicioslogica.java.EstruturaCondicional;

import java.util.Scanner;

/**
 * Problema "baskara" Fazer um programa para ler os três coeficientes de uma
 * equação do segundo grau. Usando a fórmula de Baskara, calcular e mostrar os
 * valores das raízes x1 e x2 da equação com quatro casas decimais, conforme
 * exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
 *
 * @author wesle
 */
class Baskara {

    void calcBaskara() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o coeficiente a(x²)");
        Double a = ler.nextDouble();
        System.out.println("Digite o coeficiente b(x)");
        Double b = ler.nextDouble();
        System.out.println("Digite o coeficiente c()");
        Double c = ler.nextDouble();
        Double delta = (b * b) + (-4 * a * c);
        
        if ((a == 0) || (delta < 0)) {
            System.out.println("esta equação não possui raizes");
        } else {
            Double baskarax1 = (-b + Math.sqrt(delta)) / (2 * a);
            Double baskarax2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1: " + baskarax1);
            System.out.println("x2: " + baskarax2);
        }

    }
}
