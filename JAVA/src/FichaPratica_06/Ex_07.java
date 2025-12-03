package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex_07 {
    public static void main(String[] args) {
        String caminhoArquivo = "Ficheiros/teste.txt";
        Path caminho = Path.of(caminhoArquivo);

        try {
            // Lê todas as linhas do ficheiro
            List<String> linhas = Files.readAllLines(caminho);

            int numLinhas = linhas.size();
            int numPalavras = 0;

            for (String linha : linhas) {
                if (!linha.isBlank()) {
                    String[] palavras = linha.trim().split("\\s+");
                    numPalavras += palavras.length;
                }
            }

            System.out.println("Número de linhas: " + numLinhas);
            System.out.println("Número de palavras: " + numPalavras);

        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
