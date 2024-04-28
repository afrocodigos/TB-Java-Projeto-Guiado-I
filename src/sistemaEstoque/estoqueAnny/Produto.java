package sistemaEstoque.estoqueAnny;

public class Produto {
    // atributos
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;

    // métodos construtores
    public Produto(String nomeProduto, int quantidadeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }

    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void exibirProdutos() {
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Quantidade: " + getQuantidadeProduto());
        System.out.println("Preço: " + getPrecoProduto());
    }
}