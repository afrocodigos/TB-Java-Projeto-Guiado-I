package automoveisCrud;

class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}