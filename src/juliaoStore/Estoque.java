package juliaoStore;

import java.util.ArrayList;

public class Estoque {
    // atributos
    private ArrayList<Produto> produtos;

    // método construtor
    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    // C - Create (Criar)
    public void adicionarProduto(Produto produto) {
        String nome = produto.getNome();
        String autor = produto.getAutor();
        int ano = produto.getAno();
        boolean produtoJaCadastrado = false;

        // Verifica se o produto já está cadastrado
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome) && p.getAutor().equalsIgnoreCase(autor) && p.getAno() == ano) {
                produtoJaCadastrado = true;
            }
        }

        // Se o produto não estiver cadastrado, adiciona o novo produto
        if (!produtoJaCadastrado) {
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso: " + produto.toString());
        } else {
            System.out.println("O produto já está cadastrado");
        }
    }

    // R - Read (Ler)
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade()
                        + ", Preço: " + produto.getPreco());
            }
        }
    }

    // U - Update (Atualização)
    public void atualizarProduto(String nome, int quantidade, double preco, String autor, int ano) {

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                produto.setAutor(autor);
                produto.setAno(ano);
                System.out.println("O produto " + produto.toString() + " foi atualizado com sucesso");
                return;
            } else {
                System.out.println("Produto informado não existe em estoque");

            }
        }
    }

    // D - Delete (Deletar)
    public void removerProduto(String nome) {
        for (int index = 0; index < produtos.size(); index++) {
            Produto p = produtos.get(index);
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(index);
                System.out.println("Produto removido com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    // busca produto pelo nome
    public void buscarProduto(String nome) {
        for (int index = 0; index < produtos.size(); index++) {
            Produto p = produtos.get(index);
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println(p.toString());
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

}
