package juliaoStore;
import java.util.ArrayList;

public class Estoque {
    //atributos
    private ArrayList<Produto> produtos;

    //método construtor
    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    //C - Create (Criar)
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // R - Read (Ler)
    public void listarProdutos() {
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " + produto.getPreco());
            }
        }
    }
}
