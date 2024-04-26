package sistemaEstoque.application;

import sistemaEstoque.entities.*;

public class testaSistemaEstoque {
    public static void main(String[] args) {
        System.out.println("------------------------------CRIA PRODUTO------------------------------");
        Produto produto1 = new Produto("Feijão", 7.80);
        System.out.println("Informações do produto 1");
        produto1.mostraInformacoes();
        System.out.println();

        Produto produto2 = new Produto("bANANA", 6, 1.00);
        System.out.println("Informações do produto 2");
        produto2.mostraInformacoes();
        System.out.println();

        Produto produto3 = new Produto("Jujuba", 10, 0.99);
        Produto produto4 = new Produto("NeSqUiK", 16.10);
        System.out.println();

        System.out.println("------------------------------CRIA ESTOQUE------------------------------");
        Estoque estoque = new Estoque();
        System.out.println();

        System.out.println("-----------------------LISTA PRODUTOS CADASTRADOS-----------------------");
        estoque.listaProdutos();
        System.out.println();

        System.out.println("----------------------ADICIONA PRODUTO AO SISTEMA-----------------------");
        estoque.adicionaProduto(produto1);
        estoque.adicionaProduto(produto2);
        estoque.adicionaProduto(produto4);
        System.out.println();

        System.out.println("-----------------------LISTA PRODUTOS CADASTRADOS-----------------------");
        estoque.listaProdutos();
        System.out.println();

        System.out.println("--------------ATUALIZA INFORMAÇÕES DO PRODUTO NO SISTEMA----------------");
        System.out.println("--------------------------Atualiza quantidade---------------------------");
        estoque.atualizaQuantidadeProduto(produto1, 8);
        System.out.println();

        System.out.println("-----------------------------Atualiza preço-----------------------------");
        estoque.atualizaPrecoProduto(produto2, 1.55);
        System.out.println();

        System.out.println("----------------------Atualiza informação completa----------------------");
        estoque.atualizaProduto(produto4.getNomeProduto(), -5, 16.07);
        System.out.println();
        estoque.atualizaProduto(produto4.getNomeProduto(), 3, -10.0);
        System.out.println();
        estoque.atualizaProduto(produto3.getNomeProduto(), 1, produto3.getPrecoProduto());
        System.out.println();

        System.out.println("-----------------------LISTA PRODUTOS CADASTRADOS-----------------------");
        estoque.listaProdutos();
        System.out.println();

        System.out.println("------------------------REMOVE PRODUTO DO SISTEMA-----------------------");
        estoque.removeProduto(produto2.getNomeProduto());
        System.out.println();
        estoque.removeProduto(produto3.getNomeProduto());
        System.out.println();

        System.out.println("-----------------------LISTA PRODUTOS CADASTRADOS-----------------------");
        estoque.listaProdutos();
        System.out.println();

    }
}
