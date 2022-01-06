package vetores;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class Main {
      public static void main(String args[]) {
        int op = -1;
        do {
            Scanner ler = new Scanner(System.in);
            System.out.println("\nDigite o exercicio:"
                    + "\n|0|- encerrar programa"
                    + "\t|1|- Negativos"
                    + "\t|2|- Soma_Vetor"
                    + "\t|3|- Alturas"
                    + "\t|4|- NumerosPares"
                    + "\t|5|- MaiorPosicao"
                    + "\n|6|- SomaVetores"
                    + "\t|7|- AbaixoMedia"
                    + "\t|8|- Media_Pares"
                    + "\t|9|- MaisVelho"
                    + "\t|10|- Aprovados"
                    + "\t|11|- DadosPessoas"
                    + "\t|12|- Comerciante"
            ); 
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Negativos teste1 = new Negativos();
                    teste1.metNegativos();
                    ler.close();
                    break;
                case 2:
                    SomaVetor teste2 = new SomaVetor();
                    teste2.metSomaVetor();
                    ler.close();
                    break;
                case 3:
                    Alturas teste3 = new Alturas();
                    teste3.metAlturas();
                    ler.close();
                    break;
                case 4:
                    NumerosPares teste4 = new NumerosPares();
                    teste4.metNumerosPares();
                    ler.close();
                    break;
                case 5:
                    MaiorPosicao teste5 = new MaiorPosicao();
                    teste5.metMaiorPosicao();
                    ler.close();
                    break;
                case 6:
                    SomaVetores teste6 = new SomaVetores();
                    teste6.metSomaVetores();
                    break;
                case 7:
                    AbaixoMedia teste7 = new AbaixoMedia();
                    teste7.metAbaixoMedia();
                    ler.close();
                    break;
                case 8:
                    MediaPares teste8 = new MediaPares();
                    teste8.metMediaPares();
                    ler.close();
                    break;
                case 9:
                    MaisVelho teste9 = new MaisVelho();
                    teste9.metMaisVelho();
                    ler.close();
                    break;
                case 10:
                    Aprovados teste10 = new Aprovados();
                    teste10.metAprovados();
                    ler.close();
                    break;
                case 11:
                    DadosPessoas teste11 = new DadosPessoas();
                    teste11.metDadosPessoas();
                    ler.close();
                    break;
                case 12:
                    Comerciante teste12 = new Comerciante();
                    teste12.metComerciantes();
                    ler.close();
                    break;
                case 13:
                    ler.close();
                    break;
                case 14:
                    ler.close();
                    break;
                case 15:
                    ler.close();
                    break;
                case 16:
                    ler.close();
                    break;
                case 0:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção invalida");
                    ler.close();
                    break;
            }
        } while (op != 0);
    }
}


