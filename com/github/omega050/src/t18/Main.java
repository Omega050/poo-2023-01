package t18;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Adolf Anderssen");
        Jogador jogador2 = new Jogador("Lionel Kieseritzky");

        Tabuleiro tabuleiro = new Tabuleiro();
        Partida partida = new Partida(jogador1, jogador2, tabuleiro);

        Peça peça1 = new Peça("Rei");
        Peça peça2 = new Peça("Rainha");

        partida.registrarLance(jogador1, peça1, 7, 4); // E2-E4
        partida.registrarLance(jogador2, peça2, 0, 3); // D7-D5

        // Exibir a partida registrada
        System.out.println(partida);
    }
}







