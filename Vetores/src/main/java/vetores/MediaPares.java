package vetores;

import java.util.Scanner;

/**
 * Problema "media_pares " Fazer um programa para ler um vetor de N números
 * inteiros. Em seguida, mostrar na tela a média aritmética somente dos números
 * pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar
 * a mensagem "NENHUM NUMERO PAR"
 *
 * @author wesle
 */
class MediaPares {

    void metMediaPares() {
        Scanner in = new Scanner(System.in);
        Integer n, somapar = 0;
        System.out.println("Digite a quantidade de números que deseja analisar a"
                + "\n média aritmética, dos números pares informados");
        n = in.nextInt();
        Double[] par = new Double[n];
        Double guardapar[] = new Double[n];
        Double mediapar = 0D;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            par[i] = in.nextDouble();
            if (par[i] % 2 == 0) {
                somapar++;
                guardapar[i] = par[i];
                mediapar = guardapar[i] + mediapar;
            }
        }
        mediapar = mediapar / somapar;
        if (mediapar > 0) {
            System.out.println("Os números pares são:");
            for (int i = 0; i < n; i++) {
                if (guardapar[i] != null) {
                    System.out.print("\t" + guardapar[i]);
                }
            }
            System.out.println("\n E a média desses número é: " + mediapar);
        } else {
            System.out.println("Nenhum número par registrado");
        }
    }
}
