package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EX_09 {

    public static void main(String[] args) {

        Path caminho = Path.of("Ficheiros/teste.txt");

        try {
            // 1. Ler todas as linhas do ficheiro
            List<String> linhas = Files.readAllLines(caminho);

            // 2. Juntar tudo numa só string
            String texto = "";
            for (String linha : linhas) {
                texto += linha + " ";
            }

            // 3. Remover pontuação simples
            texto = texto.replace(".", "")
                    .replace(",", "")
                    .replace("!", "")
                    .replace("?", "")
                    .replace(":", "")
                    .replace(";", "");

            // 4. Separar palavras (qualquer quantidade de espaços)
            String[] palavras = texto.trim().split("\\s+");

            String palavraMaisFreq = "";
            int max = 0;

            // 5. Contar quantas vezes cada palavra aparece
            for (int i = 0; i < palavras.length; i++) {

                String atual = palavras[i];
                int contagem = 0;

                for (int j = 0; j < palavras.length; j++) {
                    if (atual.equalsIgnoreCase(palavras[j])) {
                        contagem++;
                    }
                }

                // 6. Atualizar a palavra mais frequente
                if (contagem > max) {
                    max = contagem;
                    palavraMaisFreq = atual;
                }
            }

            // 7. Mostrar resultado
            System.out.println("Palavra mais frequente: " + palavraMaisFreq);
            System.out.println("Frequência: " + max);

        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}

