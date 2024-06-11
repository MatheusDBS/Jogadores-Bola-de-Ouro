import java.util.List;
import java.util.Scanner;

public class AdicionarJogador {
    Scanner leitor = new Scanner(System.in);
    public Jogador lerDadosJogador() {
        System.out.println("Digite o nome do jogador:");
        String nome = leitor.nextLine();
        System.out.println("Digite a idade do jogador:");
        int idade = leitor.nextInt();
        System.out.println("Digite a quantidade de Bolas de Ouro:");
        int quantidadeBolasDeOuro = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite a nacionalidade do jogador:");
        String nacionalidade = leitor.nextLine();
        System.out.println("Jogador adicionado com sucesso!");
        
        return new Jogador(nome, idade, quantidadeBolasDeOuro, nacionalidade);
    }
    public void addJogador(Jogador jogador, List<Jogador> jogadoresBolaDeOuro ) {
        jogadoresBolaDeOuro.add(jogador);
    }
}
