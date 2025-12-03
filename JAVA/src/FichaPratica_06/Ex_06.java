package FichaPratica_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ex_06 {

        public static void main(String[] args) {
            String caminhoArquivo = "Ficheiros/exercicio_06.txt";

            try {
                List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));

                String nomeMaisVelho = "";
                int idadeMaisVelho = Integer.MIN_VALUE;

                for (String linha : linhas) {
                    String[] partes = linha.split(",");
                    String nome = partes[0].trim();
                    int idade = Integer.parseInt(partes[1].trim());

                    if (idade > idadeMaisVelho) {
                        idadeMaisVelho = idade;
                        nomeMaisVelho = nome;
                    }
                }

                System.out.println("A pessoa mais velha é: " + nomeMaisVelho + " (" + idadeMaisVelho + " anos)");

            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }
