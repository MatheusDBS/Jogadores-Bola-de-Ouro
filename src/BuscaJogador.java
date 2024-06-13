import java.util.List;
import java.util.Optional;

public class BuscaJogador {

        // Método para buscar um jogador pelo nome em uma lista de jogadores
        public Jogador buscarJogadorPorNome(String nome, List<Jogador> jogadoresBolaDeOuro) {
            // Utiliza o Stream API para filtrar a lista de jogadores
            Optional<Jogador> jogador = jogadoresBolaDeOuro.stream()
                    // Aplica um filtro para encontrar um jogador cujo nome corresponda ao nome fornecido (ignora maiúsculas e minúsculas)
                    .filter(j -> j.getNome().equalsIgnoreCase(nome))
                    // Retorna o primeiro jogador que satisfaz a condição (se houver)
                    .findFirst();
            
            // Retorna o jogador encontrado ou null se nenhum jogador com o nome fornecido foi encontrado
            return jogador.orElse(null);
        }
    }
