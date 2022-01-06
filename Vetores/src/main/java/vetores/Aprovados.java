package vetores;

import java.util.Scanner;

/**
 * Problema "aprovados" Fazer um programa para ler um conjunto de N nomes de
 * alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma
 * dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes
 * dos alunos aprovados, considerando aprovados aqueles cuja média das notas
 * seja maior ou igual a 6.0 (seis).
 *
 * @author wesle
 */
class Aprovados {

    void metAprovados() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantos alunos deseja registrar");
        Integer n = in.nextInt();
        String[] nome = new String[n + 1];
        Double[] nota1 = new Double[n + 1];
        Double[] nota2 = new Double[n + 1];
        Double[] media = new Double[n + 1];
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Digite o nome do " + i + "ª aluno(a).");
            nome[i] = in.next();
            System.out.println("Digite nota de 0 a 10, primeiro semestre");
            nota1[i] = in.nextDouble();
            while (nota1[i] < 0 || nota1[i] > 10) {
                System.out.println("Valor inválido. Digite nota de 0 a 10, primeiro semestre");
                nota1[i] = in.nextDouble();
            }
            System.out.println("Digite a nota de 0 a 10, segundo semestre");
            nota2[i] = in.nextDouble();
            while (nota2[i] < 0 || nota2[i] > 10) {
                System.out.println("Valor inválido. Digite a nota de 0 a 10, segundo semestre");
                nota2[i] = in.nextDouble();
            }
            media[i] = (nota1[i] + nota2[i]) / 2;
        }
        for (int i = 1; i < n + 1; i++) {
            if (media[i] >= 6) {
                System.out.println("\n" + nome[i] + " aprovado com média " + media[i]);
            } else {
                System.out.println("\n" + nome[i] +"  não foi aprovado, sua média foi " +media[i]);
            }
        }
    }
}
