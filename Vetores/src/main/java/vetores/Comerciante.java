package vetores;

import java.util.Scanner;

/**
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
 * comercializa. Para isto, mandou digitar um conjunto de N mercadorias!, cada
 * uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
 * programa que leia tais dados e determine e escreva quantas mercadorias
 * proporcionaram:  lucro < 10%
 *  10% ≤ lucro ≤ 20%
 *  lucro > 20% Determine e escreva também o valor total de compra e de venda
 * de todas as mercadorias, assim como o lucro total
 *
 * @author wesle
 */
class Comerciante {

    void metComerciantes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos produtos serão registrados?");
        Integer n = in.nextInt();
        String[] nome = new String[n + 1];
        Double[] precoCompra = new Double[n + 1];
        Double[] precoVenda = new Double[n + 1];
        Double[] lucro = new Double[n + 1];
        Double somaCompra = 0D, somaVenda = 0D, lucroTotal = 0D;

        for (int i = 1; i < n + 1; i++) {
            System.out.println("Escreva o nome do produto " + i);
            nome[i] = in.next();
            System.out.println("Preço de compra do " + nome[i]);
            precoCompra[i] = in.nextDouble();
            System.out.println("Preço de venda do " + nome[i]);
            precoVenda[i] = in.nextDouble();
        }//porcentagem do lucro do produto[i]
        for (int i = 1; i < n + 1; i++) {
            lucro[i] = (precoVenda[i] - precoCompra[i]) / (precoCompra[i]) * 100;
        }
        Integer menorq10 = 0, entre10e20 = 0, maiorq20 = 0;
        for (int i = 1; i < n + 1; i++) {
            if (lucro[i] < 10.0) {
                menorq10++;
            } else if (lucro[i] <= 20.0) {
                entre10e20++;
            } else {
                maiorq20++;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            //somar total de compra
            somaCompra = precoCompra[i] + somaCompra;
            //somar total de venda
            somaVenda = precoVenda[i] + somaVenda;
            //lucro total }
        }
        lucroTotal = somaVenda - somaCompra;
        System.out.println(
                "Foi(ram) " + menorq10 + " produto(s) menor 10%");
        System.out.println(
                "Foi(ram) " + entre10e20 + "produto(s) entre 10% e 20%");
        System.out.println(
                "Foi(ram) " + maiorq20 + "produto(s) maior que 20%");
        System.out.println(
                "A soma das compras foram : " + somaCompra);
        System.out.println(
                "A soma das vendas foram : " + somaVenda);
        System.out.println(
                "O lucro total foi de: " + lucroTotal);
    }
}
