package akinStore;

public class Produto {
    //atributos
    private String nome;
    private int quantidade;
    private float preco;


    //métodos

    public Produto(String nome, int quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //para estudo de polimorfismo estatico, inseri o método Produto com parâmetros diferentes, mas não acho que vá servir pra algo no código
    
    public Produto (int quantidade, float preco){
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //método Get e Set

    public String getNome (){ return nome;}

    public void setNome (String nome){this.nome = nome;}

    public int getQuantidade(){return quantidade;}

    public void setQuantidade(int quantidade){this.quantidade = quantidade;}

    public float getPreco (){return preco;}

    public void setPreco (float preco){this.preco = preco;}
}