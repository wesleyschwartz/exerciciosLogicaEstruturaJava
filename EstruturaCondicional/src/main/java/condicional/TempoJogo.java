package condicional;

import java.util.Scanner;

/**
 * Problema "tempo_de_jogo" (adaptado de URI 1046) Leia a hora inicial e a hora
 * final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
 * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1
 * hora e máxima de 24 horas.
 *
 * @author wesle
 */
class TempoJogo {

    void calcTempoJogo() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a hora de inicio");
        Double horaini = ler.nextDouble();
        System.out.println("Digite a hora de fim do jogo");
        Double horafim = ler.nextDouble();
        double tempo = 0;
        if ((horaini < horafim) && horaini <= 25 && horafim <= 25) {
            tempo = horafim - horaini;
        } else if (horafim < horaini && horaini <= 25 && horafim <= 25) {
            tempo = 24 - (horaini - horafim);
        } else if (horaini.equals(horafim) && horaini <= 25 && horafim <= 25) {
            tempo = 24;
        } else {
            System.out.println("valor incorreto.");
        }
        System.out.println("a partida durou: " + tempo + " horas");
    }
}
