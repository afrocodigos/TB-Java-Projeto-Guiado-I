package juliaoStore;

public class Produto {
    //atributos
    private String nome;
    private int quantidade;
    private double preco;

    //métodos construtores
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: " + preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produto) {
            Produto produto = (Produto) obj;
            return this.nome.equals(produto.getNome());
        }
        return false;
    }


}