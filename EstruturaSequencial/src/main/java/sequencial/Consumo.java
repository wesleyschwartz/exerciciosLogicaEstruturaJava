package sequencial;
/*
Problema "consumo" 
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de 
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo 
médio do carro, com três casas decimais. 
*/

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
class Consumo {

    void calcConsumo() {
        Scanner ler = new Scanner(System.in);
         NumberFormat formato = new DecimalFormat("#.000");
        System.out.println("Digite quantos KM o carro percorreu:");
        Float distancia = ler.nextFloat();
        System.out.println("Quantos litros de combustível o carro consumil?");
        Float consumo = ler.nextFloat();
        Float media = distancia / consumo;

        System.out.println("Distancia percorrida: " + distancia
                + "\t combustível gasto: " + consumo+ "\t o automóvel fez: " + formato.format(media) +" KM/l");
    }

}