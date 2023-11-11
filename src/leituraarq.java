import  java.util.*;
import java.io.*;
public class leituraarq {
    public static void main(String[] args) {
        //caminho para o arquivo de texto
        int qtd = 0;
        int[] qtdCateg = new int[10];
        double[] valorTotalCateg = new double[10];
        int total = 0;
        String nome, nome2;
        int codigo, categoria;
        double valor;
        String caminhoArquivo = "C:\\Users\\01615788\\Desktop\\Francisco Macedo\\Estrutura de Dados\\Exercicios\\111123\\meuprojeto\\src\\produto.txt";

        try{
            //crie um objeto file  para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0,2));
                nome = linha.substring(3,34);
                nome2 = linha.substring(36,41);
                valor = Double.parseDouble(nome2);
                valor = valor/100;
                qtd = Integer.parseInt(linha.substring(43,45));
                categoria = Integer.parseInt(linha.substring(46,47));
                //impressão
                System.out.println("Codigo:" + codigo);
                System.out.println("nome:" + nome);
                System.out.println("nome2" + nome2);
                System.out.println("Valor:" + valor);
                System.out.println("\n");
                //conta o numero de itens
                qtd++;

                if(categoria == 1){
                    qtdCateg[categoria]++;
                    valorTotalCateg[categoria] = valorTotalCateg[categoria] + valor * qtd;
                }

            }
            leitor.close();
            System.out.println("**RESULTADOS FINAIS**");
            System.out.println("Contador da categoria [1]:" + qtdCateg[1]);
            System.out.println("Valor total da categoria [1]:" + valorTotalCateg[1]);
            System.out.println("Contador da categoria [1]:" + qtdCateg[1]);
            System.out.println("Valor total da categoria [1]:" + valorTotalCateg[1]);
            System.out.println("Contador da categoria [1]:" + qtdCateg[1]);
            System.out.println("Valor total da categoria [1]:" + valorTotalCateg[1]);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado no caminho especificado. Caminho informado:" + caminhoArquivo);
        }
    }
}
