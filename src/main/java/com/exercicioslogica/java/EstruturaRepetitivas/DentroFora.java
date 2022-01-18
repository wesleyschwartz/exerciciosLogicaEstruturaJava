package repetitivas;

import java.util.Scanner;

/**
 * Problema "dentro_fora" (adaptado de URI 1072) Leia um valor inteiro N. Este
 * valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
 * estão fora do intervalo, conforme exemplo
 *
 * @author wesle
 */
class DentroFora {

    void calcDentroFora() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?\n Irá estar dentro se estiver no intervalo [10,20]");
        Integer n = ler.nextInt();
        Integer r;
        Integer dentro = 0, fora = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite até n =" + n + " está no " + i);
            r = ler.nextInt();
            if (r >= 10 && r <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " DENTRO"
                + "\n" + fora + " FORA");
    }
}
