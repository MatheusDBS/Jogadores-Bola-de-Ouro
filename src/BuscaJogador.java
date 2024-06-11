import java.util.List;
import java.util.Optional;

public class BuscaJogador {
public Jogador buscarJogadorPorNome(String nome, List<Jogador> jogadoresBolaDeOuro) {
        Optional<Jogador> jogador = jogadoresBolaDeOuro.stream()
                .filter(j -> j.getNome().equalsIgnoreCase(nome))
                .findFirst();
        return jogador.orElse(null);
}
}
