import java.util.Scanner;
/**
 * Problema "multiplos" Fazer um programa para ler dois números inteiros, e
 * dizer se um número é múltiplo do outro. Os números podem ser digitados em
 * qualquer ordem.
 *
 * @author wesle
 */
class Multiplos {
    void calcMultiplos() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        Integer primeiro = ler.nextInt();
        System.out.println("Informe o segundo número");
        Integer segundo = ler.nextInt();
        if (primeiro % segundo == 0 || segundo % primeiro == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("NÃOOO são multiplos");
        }
    }
}
