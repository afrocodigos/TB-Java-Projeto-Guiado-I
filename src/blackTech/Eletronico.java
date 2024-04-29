package blackTech;

public class Eletronico extends Produto {
    private String categoria;
    private String marca;

    public Eletronico(int id, String nome, double preco, int estoque, int estoqueMinimo, String categoria, String marca) {
        super(id, nome, preco, estoque, estoqueMinimo);
        this.categoria = categoria;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + categoria + " - " + marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
