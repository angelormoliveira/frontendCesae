package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex_05 {
    public static void main(String[] args) throws IOException {
        Path origem = Path.of("Ficheiros/Ex_05.txt");

        String conteudo = Files.readString(origem);
        String[] numerosStr = conteudo.split("\\s+");
        int soma = 0;
        for (String numStr : numerosStr) {
            // Converte cada número para inteiro e adiciona à soma
            soma += Integer.parseInt(numStr);
        }

        // Mostrar caminho absoluto do ficheiro
        System.out.println("Caminho absoluto do ficheiro: " + origem.toAbsolutePath());

        // Ler e mostrar conteúdo do ficheiro
        try {
            List<String> linhas = Files.readAllLines(origem);
            System.out.println("A soma dos números do ficheiro é: " + soma);
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
