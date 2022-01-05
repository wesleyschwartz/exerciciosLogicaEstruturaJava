package sequencial;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados 
com quatro casas decimais): 
a) a área do quadrado que tem lado A 
b) a área do triângulo retângulo que base A e altura B 
c) a área do trapézio que tem bases A e B, e altura C 
*/
class Medidas {
    void calcMedidas() {
         NumberFormat formato = new DecimalFormat("#.000");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a medida A do: ");
        Double A = ler.nextDouble();
        System.out.println("Digite a medida B: ");
        Double B = ler.nextDouble();
        System.out.println("Digite a medida C: ");
        Double C = ler.nextDouble();
        Double areaqua = A*A;
        Double areatri = (A*B)/2;
        Double areatrap = ((A+B)*C)/2;
        System.out.println("Área do quadrado: " +formato.format(areaqua));
        System.out.println("Área do triângulo: " +formato.format(areatri));
        System.out.println("Área do trapézio: " +formato.format(areatrap));
    }
    
}
