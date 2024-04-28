package akinStore;
import java.util.ArrayList;

public class Estoque {
    //atributos

    private ArrayList <Produto> produtos;

    //método construtor
    public Estoque (){this.produtos = new ArrayList<>();}

    //Adicionando o produto
    public void adicionarProduto (Produto produto){
        produtos.add(produto);
        System.out.println("Produto aidicionado ao estoque!");
    }

    //Verificando a lista de produtos
    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Estoque vazio!");
        } else {
            System.out.println("Produto em estoque!");
            for (Produto produto: produtos){
                System.out.println("Nome:" + produto.getNome() + ",Quantidade:" + produto.getQuantidade() +
                 ",Preço:" + produto.getPreco());
            }
        }

        
    
    }


    //Atualizando produtos

    public void atualizarProduto (String nome, int quantidade, float preco){
        for (Produto produto : produtos);
        if(produtos.getNome().equals(nome)){
            produtos.setQuantidade(quantidade);
            produtos.setPreco(preco);
            System.out.println("O produto" + produtos.getNome() + "foi atualizado com sucesso!");
        }

        System.out.println("Produto informado  não existe em estoque");
    }

    public void removerProduto(String nome){

        for(int index = 0; index < produtos.size(); index++){
            Produto p = produtos.get(index);


            if (p.getNome().equals(nome)){
                produtos.remove(index);
                System.out.println("Produto removido do estoque!");
                return;
            }
        }

        System.out.println("Produto informado não existe em estoque");
    }

}
