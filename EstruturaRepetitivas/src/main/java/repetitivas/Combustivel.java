package repetitivas;

import java.util.Scanner;

/**
 * Problema "combustivel" (adaptado de URI 1134) Um posto de combustíveis deseja
 * determinar qual de seus produtos tem a preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da
 * seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe
 * um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo
 * código (até que seja válido). O programa será encerrado quando o código
 * informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO",
 * bem como as quantidades de cada combustível.
 *
 * @author wesle
 */
class Combustivel {

    void calcCombustivel() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Registre: |1|Álcool |2|Gasolina |3|Diesel |4|Fim");
        Integer alcool, gasolina, diesel;
        Integer entrada = ler.nextInt();
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        while (entrada != 4) {
            if (entrada == 1) {
                alcool++;
            } else if (entrada == 2) {
                gasolina++;
            } else if (entrada == 3) {
                diesel++;
            } else {
                System.out.println("Informe entre 1 ou 4...");
            }
            System.out.println("Registre: |1|Álcool |2|Gasolina |3|Diesel |4|Fim");
            entrada = ler.nextInt();
        }
        System.out.println("Quantidade de Álcool: " + alcool
                + "\nQuantidade de Gasolina: " + gasolina
                + "\nQuantidade de Diesel: " + diesel
                + "\nMuito obrigado!!");
    }
}
