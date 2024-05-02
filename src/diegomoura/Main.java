package diegomoura;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        System.out.println("\n ======================================== CREATE ========================================");
        Produto produto1 = new Produto(1, "Camisa Slim Branca", "Pixter", 199.99, 20);
        Produto produto2 = new Produto(2, "Camisa Slim Preta", "Pixter", 199.99, 20);
        Produto produto3 = new Produto(3, "Camiseta Básica", "Pixter", 99.00, 50);
        Produto produto4 = new Produto(4, "Camiseta Gola V", 20);
        Produto produto5 = new Produto(5, "Camiseta Dry Fit", 60);

        estoque.adicionarProdutos(produto1);
        estoque.adicionarProdutos(produto2);
        estoque.adicionarProdutos(produto3);
        estoque.adicionarProdutos(produto4);
        estoque.adicionarProdutos(produto5);

        System.out.println("\n ==================================== READ (BUSCAR) ====================================");
        estoque.buscarProdutos(1);
        estoque.buscarProdutos(2);
        estoque.buscarProdutos(5);
        estoque.buscarProdutos(10);

        System.out.println("\n ==================================== READ (Listar) ====================================");
        estoque.listarProdutos();

        System.out.println("\n ======================================== Update =======================================");
        produto2.setQuantidade(100);
        estoque.atualizarProduto(produto2);
        produto3.setPreco(69.89);
        estoque.atualizarProduto(produto3);

        System.out.println("\n ===================================== Lista Atualizada ================================");
        estoque.listarProdutos();

        System.out.println("\n ========================================== Delete =====================================");
        estoque.removeProduto(1);
        estoque.removeProduto(2);
        estoque.removeProduto(3);
        estoque.removeProduto(4);
        estoque.removeProduto(5);
        estoque.removeProduto(10);

        System.out.println("\n ===================================== Lista Atualizada ================================");
        estoque.listarProdutos();
    }
}
