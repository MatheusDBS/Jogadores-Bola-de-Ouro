import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcaoMenu = -1;
        MenuUsuario menuUsuario = new MenuUsuario();
        ListarJogadores listaJogadores = new ListarJogadores();
        QuemTemMaisBolaDeOuro quemTemMaisBolaDeOuro = new QuemTemMaisBolaDeOuro();
        BuscaJogador buscaJogador = new BuscaJogador();
        AdicionarJogador adicionarJogador = new AdicionarJogador();

        while (opcaoMenu != 0) {

            switch (menuUsuario.exibeMenu()) {
                case 1:
                    listaJogadores.listarJogadores(ListaJogadores.jogadoresBolaDeOuro);

                    break;

                case 2:
                    Jogador jogadorComMaisBolasDeOuro = quemTemMaisBolaDeOuro
                            .obterJogadorComMaisBolasDeOuro(ListaJogadores.jogadoresBolaDeOuro);

                    if (jogadorComMaisBolasDeOuro != null) {
                        System.out.println("Jogador com mais Bolas de Ouro: " + jogadorComMaisBolasDeOuro);
                    } else {
                        System.out.println("Nenhum jogador encontrado.");
                    }
                    break;
                case 3:
                    quemTemMaisBolaDeOuro.listarTopPaisesEJogadores(ListaJogadores.jogadoresBolaDeOuro, 3);
                    break;
                case 4:

                    Jogador novoJogador = adicionarJogador.lerDadosJogador();
                    adicionarJogador.addJogador(novoJogador, ListaJogadores.jogadoresBolaDeOuro);
                    break;
                case 5:
                    String nome = menuUsuario.lerNomeJogador();
                    Jogador jogador = buscaJogador.buscarJogadorPorNome(nome, ListaJogadores.jogadoresBolaDeOuro);
                    if (jogador != null) {
                        System.out.println(jogador);
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }

            }

        }
    }

}
