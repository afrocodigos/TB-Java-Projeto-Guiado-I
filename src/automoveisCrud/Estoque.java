package automoveisCrud;

import java.util.HashMap;
import java.util.Map;

class Estoque {
    private Map<Carro, Integer> carrosNoEstoque;

    public Estoque() {
        this.carrosNoEstoque = new HashMap<>();
    }

    // Adicionar carro ao estoque
    public void adicionarCarro(Carro carro, int quantidade) {
        carrosNoEstoque.put(carro, quantidade);
    }

    // Listar carros no estoque
    public void listarCarrosNoEstoque() {
        if (carrosNoEstoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Lista de carros no estoque:");
            for (Map.Entry<Carro, Integer> entry : carrosNoEstoque.entrySet()) {
                Carro carro = entry.getKey();
                int quantidade = entry.getValue();
                System.out.println(carro + " - Quantidade: " + quantidade);
            }
        }
    }

    // Atualizar quantidade de um carro no estoque
    public void atualizarQuantidade(Carro carro, int novaQuantidade) {
        if (!carrosNoEstoque.containsKey(carro)) {
            throw new RuntimeException("Carro não encontrado no estoque.");
        }
        carrosNoEstoque.put(carro, novaQuantidade);
    }

    // Remover carro do estoque
    public void removerCarro(Carro carro) {
        if (!carrosNoEstoque.containsKey(carro)) {
            throw new RuntimeException("Carro não encontrado no estoque.");
        }
        carrosNoEstoque.remove(carro);
    }

    // Verificar se o carro está no estoque
    public boolean carroNoEstoque(Carro carro) {

        return carrosNoEstoque.containsKey(carro);
    }
    
}