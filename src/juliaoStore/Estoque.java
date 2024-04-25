package juliaoStore;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    //atributos
    private ArrayList<Produto> produtos;

    //método construtor
    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    //C - Create (Criar)
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // R - Read (Ler)
    public void listarProdutos() {
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            int aux = 1;
            for (Produto produto : produtos) {
                System.out.println("-"+aux+": "+produto);
                aux++;
            }
        }
    }


    // U - Update (Atualizar)
    public void atualizarProduto() {
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto em estoque");
        } else {
            Scanner s = new Scanner(System.in);
            listarProdutos();
            System.out.println("Digite o número do produto que deseja atualizar: ");
            int index = s.nextInt();
            if(index > produtos.size() || index <= 0){
                System.out.println("Produto não encontrado");
            } else {
                System.out.println("Produto selecionado: "+produtos.get(index-1));
                optionsUpdate();
                int option = s.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String nome = s.next();
                        produtos.get(index-1).setNome(nome);
                        System.out.println("Nome atualizado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Digite a nova quantidade: ");
                        int quantidade = s.nextInt();
                        produtos.get(index-1).setQuantidade(quantidade);
                        System.out.println("Quantidade atualizada com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o novo preço: ");
                        double preco = s.nextDouble();
                        produtos.get(index-1).setPreco(preco);
                        System.out.println("Preço atualizado com sucesso!");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        }
    }

}
