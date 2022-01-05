package repetitivas;

import java.util.Scanner;

/**
 * Problema "sequencia_impares" (adaptado de URI 1067) Leia um valor inteiro X.
 * Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
 * se for o caso.
 * @author wesle
 */
class SequenciaImpar {

    void calcSequenciaImpar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira até onde deseja mostrar os números impares");
        Integer x = ler.nextInt();
        for (int i = 1; i <= x; i++) {
            if(i %2 != 0){
                System.out.println(i);
            }
        }
    }

}
