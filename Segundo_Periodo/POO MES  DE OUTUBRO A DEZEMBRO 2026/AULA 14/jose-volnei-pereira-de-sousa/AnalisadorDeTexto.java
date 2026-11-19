
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class AnalisadorDeTexto {

    private List<String> palavrasOrdenadas;
    private Set<String> palavrasUnicas;
    private Map<String, Integer> contagemPalavras;

    
    public AnalisadorDeTexto(String texto) {

        palavrasOrdenadas = new ArrayList<>();
        palavrasUnicas = new HashSet<>();
        contagemPalavras = new HashMap<>();

        processarTexto(texto);
    }

    
    private void processarTexto(String texto) {

        texto = texto.toLowerCase();

        texto = texto.replaceAll("[^\\p{L}\\s-]", "");

        String[] palavras = texto.trim().split("\\s+");

        for (String palavra : palavras) {

            palavrasOrdenadas.add(palavra);

            palavrasUnicas.add(palavra);

            Integer contagemAntiga = contagemPalavras.get(palavra);

            if (contagemAntiga == null) {

                contagemPalavras.put(palavra, 1);

            } else {

                contagemPalavras.put(palavra, contagemAntiga + 1);
            }
        }
    }

    
    public void exibirListaOrdenada() {

        System.out.println("--- Lista de Palavras na Ordem Original ---");
        System.out.println(palavrasOrdenadas);
        System.out.println();
    }

    
    public void exibirPalavrasUnicas() {

        System.out.println("--- Palavras Únicas (Ordem não garantida) ---");
        System.out.println(palavrasUnicas);
        System.out.println();
    }

    
    public void exibirContagemDePalavras() {

        System.out.println("--- Frequência das Palavras ---");

        for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {

            System.out.println(entrada.getKey() + ": "
                    + entrada.getValue() + "x");
        }
    }

    
    public static void main(String[] args) {

        String textoExemplo = "Java é uma linguagem de programação poderosa. "
                + "Java é usada para back-end e também para aplicações Android. "
                + "Programação em Java é divertida.";

        AnalisadorDeTexto analisador = new AnalisadorDeTexto(textoExemplo);

        analisador.exibirListaOrdenada();

        analisador.exibirPalavrasUnicas();

        analisador.exibirContagemDePalavras();
    }
}
