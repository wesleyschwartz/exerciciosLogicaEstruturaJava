package repetitivas;

import java.util.Scanner;

/**
 * Problema "senha_fixa" (adaptado de URI 1114) Escreva um programa que repita a
 * leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:".
 * Quando a senha for informada corretamente deve ser impressa a mensagem
 * "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o
 * valor 2002.
 *
 * @author wesle
 */
class SenhaFixa {
    void calcSenhaFixa() {
        Scanner ler = new Scanner(System.in);
        Integer senha;
        System.out.println("Digite a senha");
        senha = ler.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Incorreta. Tente Novamente");
            senha = ler.nextInt();
        }
        System.out.println(senha + " essa é a senha correta, acesso permitido");
    }
}
