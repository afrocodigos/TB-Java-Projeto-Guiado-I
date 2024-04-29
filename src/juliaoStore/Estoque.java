package juliaoStore;
import java.util.ArrayList;

/**
 * Classe que representa o estoque de produtos da loja.
 * Permite operações para adicionar, listar, atualizar e remover produtos.
 */
public class Estoque {
    // Lista para armazenar os produtos em estoque
    private ArrayList<Produto> produtos;

    /**
     * Construtor para criar uma instância de Estoque.
     * Inicializa a lista de produtos.
     */
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao estoque.
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    /**
     * Lista todos os produtos no estoque.
     * Exibe informações como nome, quantidade e preço de cada produto.
     */
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto em estoque.");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " + produto.getPreco());
            }
        }
    }

    /**
     * Atualiza as informações de um produto existente no estoque.
     * @param nome O nome do produto a ser atualizado.
     * @param quantidade A nova quantidade do produto.
     * @param preco O novo preço do produto.
     */
    public void atualizarProduto(String nome, int quantidade, double preco) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            System.out.println("O produto " + nome + " foi atualizado com sucesso.");
        } else {
            System.out.println("Produto informado não existe em estoque.");
        }
    }

    /**
     * Remove um produto do estoque pelo nome.
     * @param nome O nome do produto a ser removido.
     */
    public void removerProduto(String nome) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto informado não existe em estoque.");
        }
    }

    /**
     * Busca um produto pelo nome.
     * @param nome O nome do produto a ser buscado.
     * @return O produto, se encontrado; caso contrário, retorna null.
     */
    private Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
}