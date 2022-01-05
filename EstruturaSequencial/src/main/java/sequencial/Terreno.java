package sequencial;

/*
Problema "terreno" 
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
duas casas decimais, conforme exemplo. 
 */
import java.util.Scanner;

public class Terreno {

    public void calcTerreno() {
        Scanner ler = new Scanner(System.in);
        double area;
        double comprimento;
        double largura;
        double preco;
        double precoarea;
        System.out.println("digite a largura do terreno");
        largura = ler.nextDouble();
        System.out.println("digite o comprimento");
        comprimento = ler.nextDouble();
        System.out.println("digite o valor do metro quadrado");
        preco = ler.nextDouble();
        area = largura * comprimento;
        precoarea = area * preco;
        System.out.println("a area é " + area + "com o valor de RS$ " + precoarea);

    }
}
