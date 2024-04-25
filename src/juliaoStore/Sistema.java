package juliaoStore;

public class Sistema {

    static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 10, 50.0);
        Produto p2 = new Produto("Calça", 5, 100.0);
        Produto p3 = new Produto("Tênis", 2, 200.0);
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.listarProdutos();
        estoque.atualizarProduto();
        estoque.listarProdutos();
        estoque.deletarProduto();
        estoque.listarProdutos();
        estoque.deletarProduto(p1);
        estoque.listarProdutos();

    }
    
}
