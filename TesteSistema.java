import juliaoStore.Estoque;
import juliaoStore.Produto;

public class TesteSistema {
    public static void main(String[] args) {
        Produto livro = new Produto("Java", 3, 50.00);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(livro);
        estoque.listarProdutos();
        estoque.atualizarProduto("JAVA", 9, 90.00);
        estoque.removerProduto("Java");
    }

}
