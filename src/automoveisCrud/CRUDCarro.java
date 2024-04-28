package automoveisCrud;

import java.util.ArrayList;
import java.util.List;

class CRUDCarro {
    private List<Carro> carros;
    private Estoque estoque;
    private int proximoId;

    public CRUDCarro() {
        this.carros = new ArrayList<>();
        this.estoque = new Estoque();
        this.proximoId = 1;
    }

    // Create
    public void adicionarCarro(String marca, String modelo, int ano) {
        Carro novoCarro = new Carro(proximoId, marca, modelo, ano);
        carros.add(novoCarro);
        estoque.adicionarCarro(novoCarro, 0);
        proximoId++;
    }

    // Read
    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carro carro : carros) {
                System.out.println(carro);
            }
        }
    }

    // Update
    public void atualizarCarro(int id, String marca, String modelo, int ano) {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                carro.setMarca(marca);
                carro.setModelo(modelo);
                carro.setAno(ano);
                System.out.println("Carro atualizado com sucesso.");
                return;
            }
        }
        throw new RuntimeException("Carro não encontrado.");
    }

    // Delete
    public void deletarCarro(int id) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == id) {
                Carro carroRemovido = carros.remove(i);
                estoque.removerCarro(carroRemovido);
                System.out.println("Carro deletado com sucesso.");
                return;
            }
        }
        throw new RuntimeException("Carro não encontrado.");
    }

    // Listar carros no estoque
    public void listarCarrosNoEstoque() {
        estoque.listarCarrosNoEstoque();
    }

    // Atualizar quantidade de carros no estoque
    public void atualizarQuantidadeNoEstoque(int idCarro, int novaQuantidade) {
        try {
            for (Carro carro : carros) {
                if (carro.getId() == idCarro) {
                    estoque.atualizarQuantidade(carro, novaQuantidade);
                    return;
                }
            }
            throw new RuntimeException("Carro não encontrado.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Verificar se o carro está no estoque
    public boolean carroNoEstoque(Carro carro) {
        return estoque.carroNoEstoque(carro);
    }
}
