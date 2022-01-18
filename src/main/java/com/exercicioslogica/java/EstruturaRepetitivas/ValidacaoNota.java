package repetitivas;



import java.util.Scanner;

/**
 * Problema "validacao_de_nota" (adaptado de URI 1117) Faça um programa que leia
 * as notas referentes às duas avaliações de um aluno. Calcule e imprima a média
 * semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida
 * deve pertencer ao intervalo [0,10]). Cada nota deve ser validada
 * separadamente.
 *
 * @author wesle
 */
class ValidacaoNota {

    void calcValidaoNota() {
        Scanner ler = new Scanner(System.in);
        Double nota1;
        System.out.println("Digite a primeira nota entre 0 e 10");
        nota1 = ler.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Por favor, digite uma nota entre 0 e 10");
            nota1 = ler.nextDouble();
        }
        Double nota2;
        System.out.println("Digite a segunda nota entre 0 e 10");
        nota2 = ler.nextDouble();
        while ((nota2 < 0 || nota2 > 10)) {
            System.out.println("Por favor, digite uma nota entre 0 e 10");
            nota2 = ler.nextDouble();
        }
        Double media = (nota1 + nota2) /2;
        System.out.println("A média das duas notas é :" + media);
    }
}
