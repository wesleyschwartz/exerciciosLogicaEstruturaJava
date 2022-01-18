package repetitivas;


import java.util.Scanner;
/**
 * Problema "media_idades" Faça um programa para ler um número indeterminado de
 * dados, contendo cada um, a idade de um indivíduo. O último dado, que não
 * entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir
 * a idade média deste grupo de indivíduos. Se for entrado um valor negativo na
 * primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
 *
 * @author wesle
 */
class MediaIdades {

    void calcMediaIdades() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite as idades dos individuos, caso queira parar insira um número negativo ");
        Double entrada = ler.nextDouble();
        Double soma;
        Double acumulador;
        if (entrada < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            soma = 0D;
            acumulador = 0D;
            while (entrada >= 0) {
                soma = soma + entrada;
                acumulador = ++acumulador;
                entrada = ler.nextDouble();
            }
            Double media = soma / acumulador;
            System.out.println("a media das idades é " + media);
        }
    }
}
