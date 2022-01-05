package sequencial;

/*
Problema "retangulo" 
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. 
 */
import java.util.Scanner;

public class Retangulo {

    public void calcRetangulo() {
        Scanner ler = new Scanner(System.in);
        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;
        System.out.println("digite o valor da base");
        base = ler.nextDouble();
        System.out.println("digite o valor da altura");
        altura = ler.nextDouble();
        area = base * altura;
        perimetro = (2 * base) + (2 * altura);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println("Área: " + area
                + "\nPerimetro: " + perimetro
                + "\n Diagonal: " + diagonal);

    }
}
