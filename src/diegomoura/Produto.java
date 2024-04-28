package diegomoura;

public class Produto {
    private int id;
    private String nome;
    private String marca;
    private int quantidade;
    private double preco;

    //region ...Constructor
    public Produto( int id, String nome, String marca, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto( int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    //endregion

    //region ...Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //endregion

    //region ...toString
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", preco=" + preco +
                '}';
    }
    //endregion
}
