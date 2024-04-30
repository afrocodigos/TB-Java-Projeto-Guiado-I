package juliaoStore;
import java.util.ArrayList;

public class Estoque {
    //atributos
    private ArrayList<Produto> produtos;

    //método construtor
    public Estoque(){
        this.produtos = new ArrayList<Produto>();
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

    // U - Update (Atualização)
    public void atualizarProduto(String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println("O produto " + produto.getNome() + "foi atualizado com sucesso");
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    // D - Delete (Deletar)
    public void removerProduto(String nome) {
        for (int index = 0; index < produtos.size(); index++) {
            Produto p = produtos.get(index);
            if (p.getNome().equals(nome)) {
                produtos.remove(index);
                System.out.println("Produto removido com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }
}

