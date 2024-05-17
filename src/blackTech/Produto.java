package blackTech;

public class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected int estoque;
    protected int estoqueMinimo;

    public Produto(int id, String nome, double preco, int estoque, int estoqueMinimo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    @Override
    public String toString() {
        return this.nome + " - R$ " + this.preco + " - Estoque: " + this.estoque + " - Estoque mínimo: " + this.estoqueMinimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
}
