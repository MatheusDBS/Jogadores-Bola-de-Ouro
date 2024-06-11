import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuemTemMaisBolaDeOuro {
    public Jogador obterJogadorComMaisBolasDeOuro(List<Jogador> jogadoresBolaDeOuro) {
        return jogadoresBolaDeOuro.stream()
                .max((j1, j2) -> Integer.compare(j1.getQuantidadeBolasDeOuro(), j2.getQuantidadeBolasDeOuro()))
                .orElse(null);
    }

     public void listarTopPaisesEJogadores(List<Jogador> jogadoresBolaDeOuro, int topN) {
        Map<String, List<Jogador>> jogadoresPorPais = jogadoresBolaDeOuro.stream()
                .collect(Collectors.groupingBy(Jogador::getNacionalidade));

        Map<String, Integer> premiosPorPais = jogadoresPorPais.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream()
                        .mapToInt(Jogador::getQuantidadeBolasDeOuro)
                        .sum()));

        premiosPorPais.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topN)
                .forEach(entry -> {
                    String pais = entry.getKey();
                    int premios = entry.getValue();
                    List<Jogador> jogadores = jogadoresPorPais.get(pais);

                    System.out.println("País: " + pais + " - Total de prêmios: " + premios);
                    jogadores.forEach(jogador -> System.out.println("\t" + jogador));
                });
    }
}
