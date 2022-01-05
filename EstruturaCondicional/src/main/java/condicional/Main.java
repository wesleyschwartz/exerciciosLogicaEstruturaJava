package condicional;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int op = 99;
        do {
            System.out.println("Digite o exercicio:"
                    + "\n|0|- encerrar programa"
                    + "\n|1|- notas"
                    + "\t|2|- baskara"
                    + "\t|3|- operadora"
                    + "\t|4|- glicose"
                    + "\t|5|- dardo"
                    + "\t|6|- temperatura"
                    + "\t|7|- lanchonete"
                    + "\t|8|- multiplos"
                    + "\t|9|- aumento"
                    + "\t|10|- tempo_de_jogo"
                    + "\t|11|- coordenadas");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Notas teste1 = new Notas();
                    teste1.calcNotas();
                    break;
                case 2:
                    Baskara teste2 = new Baskara();
                    teste2.calcBaskara();
                    break;
                case 3:
                    Operadora teste3 = new Operadora();
                    teste3.calcOperadora();
                    break;
                case 4:
                    Glicose teste4 = new Glicose();
                    teste4.calcGlicose();
                    break;
                case 5:
                    Dardo teste5 = new Dardo();
                    teste5.calcDardo();
                    break;
                case 6:
                    Temperatura teste6 = new Temperatura();
                    teste6.calcTemperatura();
                    break;

                case 7:
                    Lanchonete teste7 = new Lanchonete();
                    teste7.calcLanchonete();
                    break;

                case 8:
                    Multiplas teste8 = new Multiplas();
                    teste8.calcMultiplos();
                    break;
                case 9:
                    Aumento teste9 = new Aumento();
                    teste9.calcAumento();
                    break;
                case 10:
                    TempoJogo teste10 = new TempoJogo();
                    teste10.calcTempoJogo();
                    break;

                case 11:
                    Coordenadas teste11 = new Coordenadas();
                    teste11.calcCoordenadas();
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
