package matrizes;

import java.util.Scanner;

/**
 * Problema "cada_linha" Ler um inteiro N e uma matriz quadrada de ordem N
 * (máximo = 10). Mostrar qual o maior elemento de cada linha. Suponha não haver
 * empates.
 * @author xbox
 */
public class Main {

    public static void main(String args[]) {
        try ( Scanner ler = new Scanner(System.in)) {
            int op = -1;
            do {

                System.out.println("\nDigite o exercicio:"
                        + "\n|0|- encerrar programa"
                        + "\n|1|- Diagonal_Negativos"
                        + "\t|2|- Soma_Linhas"
                        + "\t|3|- Negativos_Matriz"
                        + "\t|4|- Cada_Linha_Matriz"
                        + "\n|5|- Soma_Matrizes"
                        + "\t|6|- Acima_Diagonal"
                        + "\t|7|- Matriz_Geral"
                );
                op = ler.nextInt();
                ler.nextLine();
                switch (op) {
                    case 1:
                        DiagonalNegativos teste1 = new DiagonalNegativos();
                        teste1.metodoMatrizGeral(ler);
                        break;
                    case 2:
                        SomaLinhas teste2 = new SomaLinhas();
                        teste2.metodoSomaLinhas(ler);
                        break;
                    case 3:
                        NegativosMatriz teste3 = new NegativosMatriz();
                        teste3.metodoNegativosMatriz(ler);
                        break;
                    case 4:
                        CadaLinhaMatriz teste4 = new CadaLinhaMatriz();
                        teste4.metodoCadaLinha(ler);
                        break;
                    case 5:
                        SomaMatrizes teste5 = new SomaMatrizes();
                        teste5.metodoSomaMatrizes(ler);
                        break;
                    case 6:
                        AcimaDiagonal teste6 = new AcimaDiagonal();
                        teste6.metodoAcimaDiagonal(ler);
                        break;
                    case 7:
                        MatrizGeral teste7 = new MatrizGeral();
                        teste7.metodoMatrizGeral(ler);
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
}
