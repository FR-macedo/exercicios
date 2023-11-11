//Francisco Macedo 11/11/23
//Estrutura de Dados - Prof. Adylson
//Projeto *no maximo 4 pessoas por grupo*

import java.util.*;
public class Gravarprod {
    public static void main(String[] args) {
        //cria arraylist do tipo Regpro
        ArrayList<Regpro> listadeprodutos = new ArrayList<>();
        //adiciona dados dentro de tres arraylists
        listadeprodutos.add(new Regpro(1, 100, 10.99, "Produto A"));
        listadeprodutos.add(new Regpro(2, 50, 5.99, "Produto B"));
        listadeprodutos.add(new Regpro(3, 75, 7.49, "Produto C"));
        //imprime os objetos
        for ( Regpro produto : listadeprodutos ) {
            System.out.println("Codigo:" + produto.getCodigo());
            System.out.println("Preço:" + produto.getPreco());
            System.out.println("Quantidade:" + produto.getQtd());
            System.out.println("Descrição:" + produto.getDescricao());
            System.out.println("\n");
        }






        //fim
    }}
