package condicional;

import java.util.Scanner;

/**
 *Problema "glicose" 
Fazer um programa para ler a quantidade de glicose 
no sangue de uma pessoa e depois mostrar na tela a 
classificação desta glicose de acordo com a tabela de 
referência ao lado. 
* Classificação Glicose 
 Normal Até 100 mg/dl 
 Elevado Maior que 100 até 140 mg/dl 
 Diabetes Maior de 140 mg/dl 

 * @author wesle
 */
class Glicose {

    void calcGlicose() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a medida da glicose: ");
        Double medida = ler.nextDouble();
        if(medida <= 100 && medida >= 0){
            System.out.println("Classificação: normal");
        } else if (medida <= 140 && medida >= 0){
            System.out.println("classificação: elevada");
        }else if(medida > 140 && medida >= 0){
            System.out.println("classificação: diabetes");
        }else{
            System.out.println(medida+ " tá de sacanagem?? \nCORRA PARA O MÉDICO!");
        }
        
    }
    
}
