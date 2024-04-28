package juliaoStore;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<Produto> carrinho;

    public Cliente() {
        this.carrinho = new ArrayList<Produto>();;
    }

    public void adicionarAoCarrinho(Produto produto, int quantidade){
        if (produto.getQuantidade() < quantidade){
               System.out.println("Quantidade indisponivel no estoque");
           } else {
               carrinho.add(produto);
               System.out.println("produto adcionado ao carrinho");
           }
    }

    public void listarCarrinho() {
        double somaTotal = 0;

        if (carrinho.isEmpty()){
            System.out.println("Nenhum produto no carrinho");
        } else {
            System.out.println("Produtos no carrinho: ");
            for (Produto produto : carrinho) {
                somaTotal += produto.getPreco();
                System.out.println("Nome: " + produto.getNome()  + ", Preço: " + produto.getPreco());
            }
            System.out.println("Esse e o total da sua compra " + somaTotal);
            System.out.println("==========================================");
        }
    }

    public void comprarProdutos(){
        System.out.println("Vá para o caixa e pague pela sua compra, o mercadinho agradecesse  ");
    }
}
