package repetitivas;

import java.util.Scanner;

/**
 * Problema "media_ponderada" (adaptado de URI 1079) Cada caso de teste consiste
 * de 3 valores reais, para os quais você deverá calcular e mostrar a média
 * ponderada, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3
 * e o terceiro valor tem peso 5. Vale lembrar que a média ponderada é a soma de
 * todos os valores multiplicados pelo seu respectivo peso, dividida pela soma
 * dos pesos
 *
 * @author wesle
 */
class MediaPonderada {
    void calcMediaPonderada() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos casos voce vai digitar?");
        Integer n = ler.nextInt();
        Double nota1, nota2, nota3, media = 0D;
        for (int i = 1; i <= n; i++) {
            System.out.println("Caso "+i);
            System.out.println("Digite a nota 1 ");
            nota1 = ler.nextDouble() * 2;
            System.out.println("Digite a nota 2 ");
            nota2 = ler.nextDouble() * 3;
            System.out.println("Digite a nota 3 ");
            nota3 = ler.nextDouble() * 5;
            media = (nota1 + nota2 + nota3)/10;
            System.out.println("A média ponderada é " +media);
        }
    }
}
