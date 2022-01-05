package condicional;

import java.util.Scanner;

/**
 * Uma empresa vai conceder um aumento percentual de salário aos seus
 * funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
 * Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo
 * salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a
 * porcentagem de aumento. Salário atual Aumento Até R$ 1000.00 20% Acima de R$
 * 1000.00 até R$ 3000.00 15% Acima de R$ 3000.00 até R$ 8000.00 10% Acima de R$
 * 8000.00 5%
 *
 * @author wesle
 */
class Aumento {

    void calcAumento() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário");
        Double salarioini = ler.nextDouble();
        Double salariofin;
        double porc = 0;
        if (salarioini <= 1000) {
            porc = 0.2;
        } else if (salarioini <= 3000) {
            porc = 0.15;
        } else if (salarioini <= 8000) {
            porc = 0.10;
        } else {
            porc = 0.05;
        }

        salariofin = (salarioini * porc) + salarioini;

        System.out.println("Seu salário era R$ " + salarioini
                + "\nrecebeu um aumento de : " + porc * 100 + "%"
                + "\nCom o aumento o salário será de: R$ " + salariofin);
    }

}
