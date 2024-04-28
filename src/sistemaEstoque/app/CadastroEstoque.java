package sistemaEstoque.app;

import sistemaEstoque.estoqueAnny.*;

public class CadastroEstoque {
    public static void main(String[] args) {
        System.out.println("*** Criando Produto no Sistema ***");
        Produto produto1 = new Produto("Arroz", 15.80);
        System.out.println("Informações dos produtos: ");
        produto1.exibirProdutos();
        System.out.println("--------------------------------------------------------------------------------------");

        Produto produto2 = new Produto("Molho de Tomate", 12, 4.50);
        produto2.exibirProdutos();
        System.out.println("--------------------------------------------------------------------------------------");

        Produto produto3 = new Produto("Café 3 Corações", 15.90);
        produto3.exibirProdutos();
        System.out.println("--------------------------------------------------------------------------------------");

        Produto produto4 = new Produto("Filtro de café(102)", 20, 2.50);
        System.out.println();

        Estoque estoque = new Estoque();
        System.out.println();

        System.out.println("*** Produtos em estoque ***");
        estoque.listarProdutos();
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("*** Produtos adicionados no sistema ***");
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto4);
        estoque.adicionarProduto(produto3);
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("*** Estoque ***");
        estoque.listarProdutos();
        System.out.println();

        System.out.println("*** Atualizar quantidades ***");
        estoque.atualizarQntProduto(produto1, 10);
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("*** Atualização dos preços ***");
        estoque.atualizarPrecoProduto(produto2, 7.50);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("*** Atualização dos Produtos ***");
        estoque.atualizarProduto(produto1.getNomeProduto(), 8, 12.09);
        System.out.println("--------------------------------------------------------------------------------------");
        estoque.atualizarProduto(produto4.getNomeProduto(), 7, -1.0);
        System.out.println("--------------------------------------------------------------------------------------");
        estoque.atualizarProduto(produto3.getNomeProduto(), 1, 25.00);
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("*** Exclusão de Produtos do Sistema ***");
        estoque.removerProduto(produto1.getNomeProduto());
        System.out.println("--------------------------------------------------------------------------------------");
        estoque.removerProduto(produto2.getNomeProduto());
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("*** Estoque ***");
        estoque.listarProdutos();
        System.out.println();

    }
}
