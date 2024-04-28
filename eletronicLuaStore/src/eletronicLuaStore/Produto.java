package eletronicLuaStore;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	private String categoria;
	private double desconto;
	
	
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
    
    public String getCategoria() {
    	return categoria;
    	
    }
    
    public double getDesconto() {
		return desconto;
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
    
    public void setCategoria(String categoria) {
    	this.categoria = categoria;    	
    }
    
    public void setDesconto(double desconto) {
    	this.desconto = desconto;
    }
    
    public void aplicarDesconto(double percentual) {
    	
    	this.preco += (this.preco * percentual / 100);
    }
    
    public void removerDesconto() {
    	this.preco += (this.preco * this.desconto / 100);
    	this.desconto = 0;
    }
}
	 
