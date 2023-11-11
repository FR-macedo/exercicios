import  java.util.*;
import java.io.*;
public class leituraarq {
    public static void main(String[] args) {
        //caminho para o arquivo de texto
        int qtd = 0;
        String caminhoArquivo = "#####";

        try{
            //crie um objeto file  para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
                qtd++;
            }
            leitor.close();
            System.out.println("Contador:" + qtd);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado no caminho especificado. Caminho informado:" + caminhoArquivo);
        }
    }
}
