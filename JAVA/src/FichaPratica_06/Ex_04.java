package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex_04 {
    public static void main(String[] args) {
        Path origem = Path.of("Ficheiros/Ex_06.csv");

        // Mostrar caminho absoluto do ficheiro
        System.out.println("Caminho absoluto do ficheiro: " + origem.toAbsolutePath());

        // Ler e mostrar conteúdo do ficheiro
        try {
            List<String> linhas = Files.readAllLines(origem);
            System.out.println("Conteúdo do ficheiro CSV:");
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
