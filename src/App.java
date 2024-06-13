import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Variável para armazenar a opção do menu escolhida pelo usuário, inicializada com -1 para iniciar o loop
        int opcaoMenu = -1;
        
        // Criação de instâncias das várias classes que gerenciam diferentes funcionalidades da aplicação
        MenuUsuario menuUsuario = new MenuUsuario();
        ListarJogadores listaJogadores = new ListarJogadores();
        QuemTemMaisBolaDeOuro quemTemMaisBolaDeOuro = new QuemTemMaisBolaDeOuro();
        BuscaJogador buscaJogador = new BuscaJogador();
        AdicionarJogador adicionarJogador = new AdicionarJogador();
        

        // Loop para manter a aplicação em execução até que o usuário escolha sair (opção 0)
        while (opcaoMenu != 0) {

            // Exibindo o menu e obtendo a escolha do usuário
            switch (menuUsuario.exibeMenu()) {
                // Caso para listar todos os jogadores que ganharam a Bola de Ouro
                case 1:
                    listaJogadores.listarJogadores(ListaJogadores.jogadoresBolaDeOuro);
                    break;

                // Caso para encontrar e exibir o jogador com mais prêmios de Bola de Ouro
                case 2:
                    Jogador jogadorComMaisBolasDeOuro = quemTemMaisBolaDeOuro
                            .obterJogadorComMaisBolasDeOuro(ListaJogadores.jogadoresBolaDeOuro);

                    // Verificando se um jogador foi encontrado e exibindo a informação
                    menuUsuario.exibeJogadorBolaDeOuro(jogadorComMaisBolasDeOuro);
                
                // Caso para listar os principais países e jogadores com mais prêmios de Bola de Ouro
                case 3:
                    quemTemMaisBolaDeOuro.listarTopPaisesEJogadores(ListaJogadores.jogadoresBolaDeOuro, 3);
                    break;
                
                // Caso para adicionar um novo jogador
                case 4:
                    Jogador novoJogador = adicionarJogador.lerDadosJogador();
                    adicionarJogador.addJogador(novoJogador, ListaJogadores.jogadoresBolaDeOuro);
                    break;
                
                // Caso para buscar um jogador pelo nome
                case 5:
                    String nome = menuUsuario.lerNomeJogador();
                    Jogador jogador = buscaJogador.buscarJogadorPorNome(nome, ListaJogadores.jogadoresBolaDeOuro);
                    if (jogador != null) {
                        System.out.println(jogador);
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;
            }
        }
    }
}
