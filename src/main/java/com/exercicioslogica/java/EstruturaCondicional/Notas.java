package com.exercicioslogica.java.EstruturaCondicional;

import java.util.Scanner;

/**
 * Problema "notas" Fazer um programa para ler as duas notas que um aluno obteve
 * no primeiro e segundo semestres de uma disciplina anual. Em seguida, mostrar
 * a nota final que o aluno obteve (com uma casa decimal) no ano juntamente com
 * um texto explicativo. Caso a nota final do aluno seja inferior a 60.00,
 * mostrar a mensagem "REPROVADO", conforme exemplos.
 *
 * @author wesle
 */
class Notas {

    void calcNotas() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        Double nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota");
        Double nota2 = ler.nextDouble();
        Double media = (nota1 + nota2)/2;
        if (media >= 60 && media <= 100) {
            System.out.println("Aprovado!! Suas notas foram: " + nota1 + ", " + nota2 + ". E sua média geral foi de: " + media);
        } else if (media < 60 && media >= 0) {
            System.out.println("Infelizmente você foi reprovado!! Suas notas foram: " + nota1 + ", " + nota2 + ". E sua média geral foi de: " + media);
        } else {
            System.out.println("Valores inválidos");
        }

    }

}
