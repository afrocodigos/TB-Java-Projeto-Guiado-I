package juliaoStore;

import java.util.UUID;

public class Produto {
    // atributos
    private UUID id;
    private String nome;
    private int quantidade;
    private double preco;
    private String autor;
    private int ano;

    // métodos construtores
    public Produto(String nome, int quantidade, double preco, String autor, int ano) {
        this.id = UUID.randomUUID();
        ;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.autor = autor;
        this.ano = ano;
    }

    public Produto() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", autor="
                + autor + ", ano=" + ano + "]";
    }

}