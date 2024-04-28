package eletronicLuaStore;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Celular", 10, 1500.0);
        Produto p2 = new Produto("Tablet", 5, 1000.0);
        Produto p3 = new Produto("Notebook", 3, 2500.0);

        // Criando estoque
        Estoque estoque = new Estoque();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        // Listando produtos no estoque
        System.out.println("Produtos no estoque:");
        estoque.listarProdutos();

        // Atualizando produto
        estoque.atualizarProduto("Celular", 15, 1600.00);

        // Removendo produto
        estoque.removerProduto("Tablet");

        // Listando produtos atualizados no estoque
        System.out.println("\nProdutos atualizados no estoque:");
        estoque.listarProdutos();

        // Buscando produto por nome
        System.out.println("\nBuscando produto por nome:");
        Produto produtoEncontrado = estoque.buscarProdutoPorNome("Notebook");
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Calculando valor total do estoque
        System.out.println("\nValor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Produto mais caro
        Produto maisCaro = estoque.encontrarProdutoMaisCaro();
        System.out.println("Produto mais caro: " + maisCaro.getNome() + ", Preço: R$" + maisCaro.getPreco());

        // Produto mais barato
        Produto maisBarato = estoque.encontrarProdutoMaisBarato();
        System.out.println("Produto mais barato: " + maisBarato.getNome() + ", Preço: R$" + maisBarato.getPreco());

        // Ordenando produtos por nome e listando
        System.out.println("\nProdutos ordenados por nome:");
        estoque.ordenarProdutosPorNome();
        estoque.listarProdutos();
    }
}

