package repetitivas;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int op = 99;
        do {
            System.out.println("Digite o exercicio:"
                    + "\n|0|- encerrar programa"
                    + "\n|WHILE|:  "
                    + "\t|1|- Crescente"
                    + "\t|2|- Media_Idades"
                    + "\t|3|- Senha_Fixa"
                    + "\t|4|- Quadrante"
                    + "\t|5|- ValadicaoNota"
                    + "\t|6|- Combustivel"
                    + "\t|7|- Pares_Consecutivos"
                    + "\n|FOR|:  "
                    + "\t|8|- Tabuada"
                    + "\t|9|- Soma_Impares"
                    + "\t|10|- Sequencia_Impar"
                    + "\t|11|- Dentro_Fora"
                    + "\t|12|- ParImpar"
                    + "\t|13|- MediaPonderada"
                    + "\t|14|- Divisão"
                    + "\t|15|- Fatorial"
                    + "\t|16|- Experiencia"
            );

            op = ler.nextInt();
            switch (op) {
                case 1:
                    Crescente teste1 = new Crescente();
                    teste1.calcCrescente();
                    break;
                case 2:
                    MediaIdades teste2 = new MediaIdades();
                    teste2.calcMediaIdades();
                    break;
                case 3:
                    SenhaFixa teste3 = new SenhaFixa();
                    teste3.calcSenhaFixa();
                    break;
                case 4:
                    Quadrante teste4 = new Quadrante();
                    teste4.calcQuadrante();
                    break;
                case 5:
                    ValidacaoNota teste5 = new ValidacaoNota();
                    teste5.calcValidaoNota();
                    break;
                case 6:
                    Combustivel teste6 = new Combustivel();
                    teste6.calcCombustivel();
                    break;
                case 7:
                    ParesConsecutivos teste7 = new ParesConsecutivos();
                    teste7.calcParesConsec();
                    break;

                case 8:
                    Tabuada teste8 = new Tabuada();
                    teste8.calcTabuada();
                    break;
                case 9:
                    SomaImpar teste9 = new SomaImpar();
                    teste9.calcSomaImpar();
                    break;
                case 10:
                    SequenciaImpar teste10 = new SequenciaImpar();
                    teste10.calcSequenciaImpar();
                    break;
                case 11:
                    DentroFora teste11 = new DentroFora();
                    teste11.calcDentroFora();
                    break;
                case 12:
                    ParImpar teste12 = new ParImpar();
                    teste12.calcParImpar();
                    break;

                case 13:
                    MediaPonderada teste13 = new MediaPonderada();
                    teste13.calcMediaPonderada();
                    break;
                case 14:
                    Divisao teste14 = new Divisao();
                    teste14.calcDivisao();
                    break;
                    
                case 15:
                    Fatorial teste15 = new Fatorial();
                    teste15.calcFatorial();
                    break;
                case 16:
                    Experiencias teste16 = new Experiencias();
                    teste16.calcExp();
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
