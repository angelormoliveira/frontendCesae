package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {

       File arquivo = new File("Ficheiros/Ex_02.txt");

       //Criar máquina de escrever
        PrintWriter maquinaEscrever = new PrintWriter(arquivo);

        //Escrever uma mensagem
        String mensagem;
        mensagem = "Teste";
        maquinaEscrever.println(mensagem);

        maquinaEscrever.close();

    }
}
