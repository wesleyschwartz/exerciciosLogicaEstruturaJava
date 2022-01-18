package com.exercicioslogica.java.EstruturaCondicional;

import java.util.Scanner;

/**
 * Problema "temperatura" Deseja-se converter uma medida de temperatura da
 * escala Celsius para Fahrenheit ou vice-versa. Para isso, você deve construir
 * um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
 * informada uma temperatura. Em seguida o programa deve mostrar a temperatura
 * na outra escala com duas casas decimais. A seguir é dada a fórmula para
 * converter de Fahrenheit para Celsius (você deve deduzir a fórmula de Celsius
 * para Fahrenheit): ( C=5/9(F-32));
 *
 * @author wesle
 */
class Temperatura {

    public void calcTemperatura() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe qual temperatura deseja converter:"
                + "\n 'F'-> de Fahrenheit para Celsius"
                + "\n 'C'-> de Celsius para Fahrenheit");
        String escolha = ler.nextLine();
        if (escolha.equalsIgnoreCase("F")) {
            System.out.println("Digite o valor em Fahrenheit");
            Double valorF = ler.nextDouble();
            Double C = (5*(valorF - 32))/9;
            System.out.println("O valor de "+valorF+"º Fahrenheit é de "+C+"º em Celsius");
        }else if(escolha.equalsIgnoreCase("c")){
            System.out.println("Digite o valor em Celsius");
            Double valorC = ler.nextDouble();
            Double F = (1.8*valorC +32);
            System.out.println("O valor de "+valorC+"º Celsius é de "+F+"º em Fahrenheit");
        }else{
            System.out.println("Letra errada...");
        }
    }
}
