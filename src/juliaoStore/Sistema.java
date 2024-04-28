package juliaoStore;
import java.util.Scanner;
public class Sistema {

    static Estoque estoque = new Estoque();

    public static void menu() {
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Atualizar produto");
        System.out.println("3 - Deletar produto");
        System.out.println("4 - Listar produtos");
        System.out.println("5 - Sair");
    }
    public static void defaultEstoque(){
        Produto p1 = new Produto("Arroz", 10, 5.0);
        Produto p2 = new Produto("Feijão", 5, 7.0);
        Produto p3 = new Produto("Macarrão", 7, 3.0);
        Produto p4 = new Produto("Açúcar", 15, 4.0);
        Produto p5 = new Produto("Sal", 20, 2.0);
        Produto p6 = new Produto("Óleo", 10, 6.0);
        Produto p7 = new Produto("Farinha", 12, 3.5);
        Produto p8 = new Produto("Leite", 30, 3.0);
        Produto p9 = new Produto("Café", 15, 10.0);
        Produto p10 = new Produto("Chá", 20, 5.0);
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.adicionarProduto(p4);
        estoque.adicionarProduto(p5);
        estoque.adicionarProduto(p6);
        estoque.adicionarProduto(p7);
        estoque.adicionarProduto(p8);
        estoque.adicionarProduto(p9);
        estoque.adicionarProduto(p10);
    }
    public static void main(String[] args) {
        int opt = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de controle de estoque!");
        System.out.println("Você deseja adicionar o estoque padrão? (S/N)");
        String op = s.next();
        if(op.equalsIgnoreCase("S")){
            defaultEstoque();
        }
        do{
            menu();
            opt = s.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = s.next();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = s.nextInt();
                    System.out.println("Digite o preço do produto: ");
                    double preco = s.nextDouble();
                    Produto produto = new Produto(nome, quantidade, preco);
                    estoque.adicionarProduto(produto);
                    break;
                case 2:
                    estoque.atualizarProduto();
                    break;
                case 3:
                    estoque.deletarProduto();
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        }while(opt != 5);
        
    }
    
}
