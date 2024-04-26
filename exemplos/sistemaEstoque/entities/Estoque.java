package sistemaEstoque.entities;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> listaProdutos;

    public Estoque(){
        this.listaProdutos = new ArrayList<Produto>();
        System.out.println("Estoque criado");
    }

    private int indiceEstoque(String nomeProduto){
        int indiceEstoque = -1;
        for (int i = 0; i < listaProdutos.size(); i++){
            Produto produto = listaProdutos.get(i);
            if (produto.getNomeProduto().equals(nomeProduto)){
                indiceEstoque = i;
            }
        }
        return indiceEstoque;
    }
    private boolean checaCadastro(String nomeProduto){
        boolean statusCadastro = false;
        if (indiceEstoque(nomeProduto) != -1){
            statusCadastro = true;
        }
        return statusCadastro;
    }

    // CRUD
    // Funções Create
    public void adicionaProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.printf("Produto '%s' cadastrado no sistema\n", produto.getNomeProduto());
    }

    // Funções Read
    public void listaProdutos() {
        if (listaProdutos.isEmpty()){
            System.out.println("O sistema ainda está sem produtos cadastrados");
        }
        else {
            for (Produto produto : listaProdutos) {
                System.out.printf("%s - %d unidade(s) (R$ %.2f cada)\n", produto.getNomeProduto(), produto.getQuantidadeProduto(), produto.getPrecoProduto());
            }
        }
    }

    // Funções Update
    public void atualizaQuantidadeProduto(Produto produto, int novaQuantidade){
        if (checaCadastro(produto.getNomeProduto())) {
            if (novaQuantidade > 0) {
                produto.setQuantidadeProduto(novaQuantidade);
                System.out.printf("Quantidade do produto '%s' atualizada\n", produto.getNomeProduto());
            } else {
                System.out.println("A nova quantidade de produto não pode ser menor que zero. Tente outro valor");
            }
        }
        else {
            System.out.printf("Produto '%s' não cadastrado no sistema\n", produto.getNomeProduto());
        }
    }
    public void atualizaPrecoProduto(Produto produto, double novoPreco){
        if (checaCadastro(produto.getNomeProduto())) {
            if (novoPreco > 0) {
                produto.setPrecoProduto(novoPreco);
                System.out.printf("Preço do produto '%s' atualizado\n", produto.getNomeProduto());
            } else {
                System.out.println("O novo preço não pode ser menor que zero. Tente outro valor");
            }
        }
        else {
            System.out.printf("Produto '%s' não cadastrado no sistema\n", produto.getNomeProduto());
        }
    }
    public void atualizaProduto(String nomeProduto, int quantidadeProduto, double precoProduto){
        if (checaCadastro(nomeProduto)){
            Produto produto = listaProdutos.get(indiceEstoque(nomeProduto));
            atualizaQuantidadeProduto(produto, quantidadeProduto);
            atualizaPrecoProduto(produto, precoProduto);
            System.out.printf("Informações do produto '%s' atualizadas\n", produto.getNomeProduto());
        }
        else {
            System.out.println("Produto não cadastrado no sistema");
        }
    }

    // Funções Delete
    public void removeProduto(String nomeProduto){
        if (checaCadastro(nomeProduto)){
            listaProdutos.remove(indiceEstoque(nomeProduto));
            System.out.println("Produto removido do sistema com sucesso");
        }
        else {
            System.out.println("Produto não cadastrado no sistema");
        }
    }
}
