package juliaoStore;

/**
 * Classe que representa um Produto dentro da loja.
 * Armazena informações como nome, quantidade em estoque e preço.
 */
public class Produto {
    // Atributos privados para armazenar informações do produto
    private String nome;
    private int quantidade;
    private double preco;

    /**
     * Construtor para inicializar um novo produto com nome, quantidade e preço.
     * @param nome O nome do produto.
     * @param quantidade A quantidade em estoque do produto.
     * @param preco O preço do produto.
     */
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos getters e setters para acessar e atualizar os atributos do produto

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}