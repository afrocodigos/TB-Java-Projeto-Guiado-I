package sistemaEstoque.estoqueAnny;

import java.util.ArrayList;

public class Estoque {
    // atributos
    private ArrayList<Produto> produtosList;

    // método construtor
    public Estoque() {
        this.produtosList = new ArrayList<Produto>();
        System.out.println("Estoque");
    }

    protected int contagemEstoque(String nomeProduto) {
        int contagemEstoque = -1;
        for (int i = 0; i < produtosList.size(); i++)

        {
            Produto produto = produtosList.get(i);
            if (produto.getNomeProduto().equals(nomeProduto)) {
                contagemEstoque = i;
            }
        }
        return contagemEstoque;
    }

    protected boolean verificacaoCadastro(String nomeProduto) {
        boolean validarCadastro = false;
        if (contagemEstoque(nomeProduto) != -1) {
            validarCadastro = true;
        }
        return validarCadastro;
    }

    // Funções CRUD
    // Create
    public void adicionarProduto(Produto produto) {
        produtosList.add(produto);
        System.out.println("Produto " + produto.getNomeProduto() + " cadastrado no estoque!");
    }

    // Read
    public void listarProdutos() {
        if (produtosList.isEmpty()) {
            System.out.println("Ainda não há nenhum produto cadastrado no estoque! :( ");
        } else {
            System.out.println("Produtos disponiveis em estoque: ");
            for (Produto produto : produtosList) {
                System.out
                        .println("Produto: " + produto.getNomeProduto() + " / Esta disponivel em: "
                                + produto.getQuantidadeProduto() + " unidades /"
                                + " R$ " + produto.getPrecoProduto());
            }
        }
    }

    // Update
    // Atualizar a quantidade de produtos
    public void atualizarQntProduto(Produto produto, int newQuantidade) {
        if (verificacaoCadastro(produto.getNomeProduto())) {
            if (newQuantidade > 0) {
                produto.setQuantidadeProduto(newQuantidade);
                System.out.println("Quantidade do produto " + produto.getNomeProduto() + " atualizado!");
            } else {
                System.out.println(
                        "Ops! Algo deu errado! A nova quantidade não pode ser menor que 0 (zero). Tente novamente.");
            }
        } else {
            System.out.println("O produto informado não existe em estoque");
        }

    }

    // Atualizar o preço dos produtos
    public void atualizarPrecoProduto(Produto produto, double newPreco) {
        if (verificacaoCadastro(produto.getNomeProduto())) {
            if (newPreco > 0) {
                produto.setPrecoProduto(newPreco);
                System.out.println("Preço do produto " + produto.getNomeProduto() + " atualizado");
            } else {
                System.out.println(
                        "Ops! Algo deu errado! O preço (R$) não pode ter valor menor que 0. Tente um novo valor.");
            }
        }
    }

    // Atualizar os produtos
    public void atualizarProduto(String nomeProduto, int quantidadeProduto, double precoProduto) {
        if (verificacaoCadastro(nomeProduto)) {
            Produto produto = produtosList.get(contagemEstoque(nomeProduto));
            atualizarQntProduto(produto, quantidadeProduto);
            atualizarPrecoProduto(produto, precoProduto);
            System.out.println("Produto(s)" + produto.getNomeProduto() + " atualizado(s) com sucesso!");
        }
    }

    // Delete
    public void removerProduto(String nomeProduto) {
        if (verificacaoCadastro(nomeProduto)) {
            produtosList.remove(contagemEstoque(nomeProduto));
            System.out.println("Você removeu o produto do sistema!");
        } else {
            System.out.println("Produto informado não esta disponivel em estoque");
        }
    }
}
