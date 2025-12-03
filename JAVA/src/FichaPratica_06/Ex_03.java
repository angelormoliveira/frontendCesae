package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Ex_03 {
        public static void main(String[] args) {
            Path origem = Path.of("Ficheiros/ficheiro_Ex_01.txt");
            Path destino = Path.of("Ficheiros/teste.txt");

            try {
                // Copia o arquivo, substituindo se já existir
                Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Arquivo copiado com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao copiar arquivo: " + e.getMessage());
            }
        }
    }

