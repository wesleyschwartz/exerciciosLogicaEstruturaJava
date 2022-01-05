package sequencial;


import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int op = 99;
        do {
            System.out.println("Digite a op\u00e7\u00e3o:"
                    + "\n|0| encerrar"
                    + "\t|1| terreno"
                    + "\t|2| retangulo"
                    + "\t|3| idade"
                    + "\t|4| soma"
                    + "\t|5| troco"
                    + "\t|6| circulo"
                    + "\t|7| pagamento"
                    + "\t|8| consumo"
                    + "\t|9| medidas"
                    + "\t|10| duração"
            );
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Terreno teste = new Terreno();
                    teste.calcTerreno();
                    break;

                case 2:
                    Retangulo teste2 = new Retangulo();
                    teste2.calcRetangulo();
                    break;

                case 3:
                    Idades teste3 = new Idades();
                    teste3.mediaIdade();
                    break;

                case 4:
                    Soma teste4 = new Soma();
                    teste4.calcSoma();
                    break;

                case 5:
                    Troco teste5 = new Troco();
                    teste5.calcTroco();
                    break;
                case 6:
                    Circulo teste6 = new Circulo();
                    teste6.calcCirculo();
                    break;

                case 7:
                    Pagamento teste7 = new Pagamento();
                    teste7.calcPagamento();
                    break;
                    
                case 8:
                    Consumo teste8  = new Consumo();
                    teste8.calcConsumo();
                    break;
                case 9:
                    Medidas teste9 = new Medidas();
                    teste9.calcMedidas();
                    break;
                    
                case 10:
                    Duracao teste10 = new Duracao();
                    teste10.calcDuracao();
                    break;
                case 0:
                    System.out.println("Sistema encerrado");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (op != 0);
    }
}
