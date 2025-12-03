package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex_08 {
    public static void main(String[] args) {
        Path ficheiro = Path.of("Ficheiros/teste.txt");

        try {
            // Lê todas as linhas
            List<String> linhas = Files.readAllLines(ficheiro);

            // Junta tudo numa string só
            String texto = "";
            for (String linha : linhas) {
                texto += linha + " ";
            }

            // Remove pontuação comum
            texto = texto.replace(".", "")
                    .replace(",", "")
                    .replace("!", "")
                    .replace("?", "")
                    .replace(";", "")
                    .replace(":", "");

            // Divide por qualquer quantidade de espaços
            String[] palavras = texto.trim().split("\\s+");

            String maisFreq = "";
            int max = 0;

            // Conta a frequência de cada palavra
            for (int i = 0; i < palavras.length; i++) {

                String atual = palavras[i];

                if (atual.isBlank()) continue;

                int contagem = 0;

                // Conta quantas vezes aparece
                for (int j = 0; j < palavras.length; j++) {
                    if (atual.equalsIgnoreCase(palavras[j])) {
                        contagem++;
                    }
                }

                // Atualiza a mais frequente
                if (contagem > max) {
                    max = contagem;
                    maisFreq = atual;
                }
            }

            System.out.println("Palavra mais frequente: " + maisFreq);
            System.out.println("Frequência: " + max);

        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}


 