package juliaoStore;

public class Loja {
    private final Produto[] carrinho;
    private final Produto[] estoque;

    // Método construtor
    public Loja() {
        this.carrinho = new Produto[10]; // Array de produtos para o carrinho
        this.estoque = new Produto[]{
            new Produto("Camisa", 10, 50.0),
            new Produto("Calça", 5, 100.0),
            new Produto("Tênis", 20, 200.0),
            new Produto("Boné", 30, 30.0),
            new Produto("Meia", 50, 10.0)
        };
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProdutoAoCarrinho(int idProduto, int quantidade) {
        Produto produto = this.estoque[idProduto];
        if (this.carrinho[idProduto] == null) {
            this.carrinho[idProduto] = new Produto(produto.getNome(), 0, produto.getPreco());
        }
        this.carrinho[idProduto].setQuantidade(this.carrinho[idProduto].getQuantidade() + quantidade);
        this.estoque[idProduto].setQuantidade(this.estoque[idProduto].getQuantidade() - quantidade);
    }

    // Método para remover um produto do carrinho
    public void removerProdutoDoCarrinho(int idProduto, int quantidade) {
        if (this.carrinho[idProduto] != null) {
            this.carrinho[idProduto].setQuantidade(Math.max(0, this.carrinho[idProduto].getQuantidade() - quantidade));
            this.estoque[idProduto].setQuantidade(this.estoque[idProduto].getQuantidade() + quantidade);
        }
    }

    // Método para finalizar a compra
    public void finalizarCompra() {
        double total = 0.0;
        for (Produto produto : this.carrinho) {
            if (produto != null) {
                total += produto.getPreco() * produto.getQuantidade();
            }
        }
        System.out.println("Total da compra: R$" + total);
    }

    // Método main para executar uma compra de teste
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarProdutoAoCarrinho(0, 2);
        loja.adicionarProdutoAoCarrinho(1, 1);
        loja.adicionarProdutoAoCarrinho(2, 1);
        loja.adicionarProdutoAoCarrinho(3, 2);
        loja.adicionarProdutoAoCarrinho(4, 3);

        loja.removerProdutoDoCarrinho(0, 1);
        loja.removerProdutoDoCarrinho(1, 1);
        loja.removerProdutoDoCarrinho(2, 1);

        loja.finalizarCompra();
    }
}
