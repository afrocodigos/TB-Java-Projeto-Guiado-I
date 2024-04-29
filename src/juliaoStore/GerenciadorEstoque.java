package juliaoStore;

/**
 * Classe principal que gerencia as operações de estoque.
 * Este arquivo serve como ponto de entrada para o programa de gerenciamento de estoque.
 */
public class GerenciadorEstoque {
    public static void main(String[] args) {
        // Cria uma instância de Estoque para gerenciar produtos.
        Estoque estoque = new Estoque();

        // Adiciona produtos ao estoque. Cada produto é criado com nome, quantidade e preço.
        estoque.adicionarProduto(new Produto("Caderno", 50, 7.99));
        estoque.adicionarProduto(new Produto("Caneta", 100, 1.50));

        // Lista todos os produtos no estoque. Mostra nome, quantidade e preço de cada um.
        estoque.listarProdutos();

        // Atualiza as informações de um produto existente no estoque.
        // Neste caso, a quantidade e o preço do "Caderno" são atualizados.
        estoque.atualizarProduto("Caderno", 45, 8.99);

        // Lista novamente os produtos para mostrar as atualizações feitas.
        estoque.listarProdutos();

        // Remove um produto do estoque pelo nome.
        estoque.removerProduto("Caneta");

        // Lista os produtos após a remoção para verificar o estado atual do estoque.
        estoque.listarProdutos();
    }
}