package sistemaEstoque.entities;

public class Produto {
    // atributos
    private String nomeProduto;
    private int quantidadeProduto = 0;
    private double precoProduto;

    // construtores
    public Produto(String nomeProduto, int quantidadeProduto, double precoProduto){
        nomeProduto = nomeProduto.toLowerCase();
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        System.out.printf("Produto '%s' criado\n", nomeProduto);
    }
    public Produto(String nomeProduto, double precoProduto){
        nomeProduto = nomeProduto.toLowerCase();
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        System.out.printf("Produto '%s' criado\n", nomeProduto);
    }

    // métodos
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
    public void mostraInformacoes(){
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Quantidade: " + getQuantidadeProduto());
        System.out.printf("Preço unitário: R$ %.2f\n", getPrecoProduto());
    }
}
