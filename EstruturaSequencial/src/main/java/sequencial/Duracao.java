package sequencial;


import java.util.Scanner;

/*
Problema "duracao" 
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
formato horas:minutos:segundos. 
 */
class Duracao {

    void calcDuracao() {
        Scanner ler = new Scanner(System.in);
        Integer horas = 0;
        Integer minutos = 0;
        Integer segundos = 0;
        Integer armazenador;
        Integer resto;
        System.out.println("Digite quantos segundos deseja converter em formato de hora:minuto:segundos");
        armazenador = ler.nextInt();
        horas = armazenador;
        horas = armazenador/3600;
        resto = armazenador % 3600;
        minutos = (resto)/60;
        segundos = (resto % 60);
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }

}
