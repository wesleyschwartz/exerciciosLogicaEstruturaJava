package com.exercicioslogica.java.EstruturaCondicional;

import java.util.Scanner;

/**
 * Problema "dardo" No arremesso de dardo, o atleta tem três chances para lançar
 * o dardo à maior distância que conseguir. Você deve criar um programa para,
 * dadas as medidas das três tentativas de lançamento, informar qual foi a
 * maior.
 *
 * @author wesle
 */
class Dardo {

    void calcDardo() {
        Scanner ler = new Scanner(System.in);
        Double[] medidas = new Double[3];
        System.out.println("Digite as 3 medidas");
        medidas[0] = ler.nextDouble();
        medidas[1] = ler.nextDouble();
        medidas[2] = ler.nextDouble();
        if (medidas[0] > medidas[1] && medidas[0] > medidas[2]) {
            System.out.println("As medidas foram:"
                    + "\t 1- " + medidas[0]
                    + "\t 2- " + medidas[1]
                    + "\t 3- " + medidas[2]
                    + "\n A maior foi " + medidas[0]);
        } else if (medidas[1] > medidas[0] && medidas[1] > medidas[2]) {
            System.out.println("As medidas foram:"
                    + "\t 1- " + medidas[0]
                    + "\t 2- " + medidas[1]
                    + "\t 3- " + medidas[2]
                    + "\n A maior foi " + medidas[1]);
        } else {
            System.out.println("As medidas foram:"
                    + "\t 1- " + medidas[0]
                    + "\t 2- " + medidas[1]
                    + "\t 3- " + medidas[2]
                    + "\n A maior foi " + medidas[2]);
        }

    }
}
