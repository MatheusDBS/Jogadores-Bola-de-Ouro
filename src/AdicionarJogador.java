import java.util.List;
import java.util.Scanner;

public class AdicionarJogador {
    // Cria um Scanner para ler a entrada do usuário
    Scanner leitor = new Scanner(System.in);
    
    // Método para ler os dados de um novo jogador
    public Jogador lerDadosJogador() {
        // Solicita e lê o nome do jogador
        System.out.println("Digite o nome do jogador:");
        String nome = leitor.nextLine();
        
        // Solicita e lê a idade do jogador
        System.out.println("Digite a idade do jogador:");
        int idade = leitor.nextInt();
        
        // Solicita e lê a quantidade de Bolas de Ouro do jogador
        System.out.println("Digite a quantidade de Bolas de Ouro:");
        int quantidadeBolasDeOuro = leitor.nextInt();
        
        // Limpa o buffer do Scanner
        leitor.nextLine();
        
        // Solicita e lê a nacionalidade do jogador
        System.out.println("Digite a nacionalidade do jogador:");
        String nacionalidade = leitor.nextLine();
        
        // Exibe uma mensagem confirmando a adição do jogador
        System.out.println("Jogador adicionado com sucesso!");
        
        // Cria e retorna um novo objeto Jogador com os dados lidos
        return new Jogador(nome, idade, quantidadeBolasDeOuro, nacionalidade);
    }
    
    // Método para adicionar o novo jogador à lista de jogadores com Bolas de Ouro
    public void addJogador(Jogador jogador, List<Jogador> jogadoresBolaDeOuro) {
        // Adiciona o jogador à lista fornecida
        jogadoresBolaDeOuro.add(jogador);
    }
}
