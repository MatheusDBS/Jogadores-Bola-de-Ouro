import java.util.List;

public class Jogador {
    private String nome;
    private int idade;
    private int quantidadeBolasDeOuro;
    private String nacionalidade;

    public Jogador(String nome, int idade, int quantidadeBolasDeOuro, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeBolasDeOuro = quantidadeBolasDeOuro;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Nacionalidade: " + nacionalidade+
                ", Bolas de ouro: "+ quantidadeBolasDeOuro;

    }
    public int getQuantidadeBolasDeOuro() {
        return quantidadeBolasDeOuro;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNome() {
        return nome;
    }

}
