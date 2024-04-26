package blackTech;

import java.util.*;

public class Loja {
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        //  Menu interativo que permita ao usuário escolher e realizar todas as funcionalidades disponíveis
        do {
            System.out.println("Menu:");

            // Métodos de Criação (Create)
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Realizar Venda");

            // Métodos de Leitura (Read)
            System.out.println("4. Listar Produtos");
            System.out.println("5. Listar Vendas");
            System.out.println("6. Listar Clientes");
            System.out.println("7. Relatório de Faturamento");
            System.out.println("8. Relatório de Estoque Mínimo");

            // Métodos de Edição (Update)
            System.out.println("9. Editar Produtos");

            // Métodos de Exclusão (Delete)
            System.out.println("10. Remover Produtos");

            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // cadastrarProduto();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 10);

        scanner.close();
    }
}
