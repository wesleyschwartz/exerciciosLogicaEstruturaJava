package sequencial;
/*
Problema "circulo" 
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do 
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟
ଶ
. Você pode 
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use 
diretamente o valor 3.14159. 
*/
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
class Circulo {
    public void calcCirculo() {
        Scanner ler = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.000");
        Double raio;
        System.out.println("Digite o valor do raio do circulo");
        raio = ler.nextDouble();
        Double area =  Math.PI*(raio*raio);
        
        System.out.println("A área é: " + formato.format(area));
    }
    
}
