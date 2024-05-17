package blackTech;

public class Menu {

    public static void ExibirMenu() {
    System.out.println("Menu:");

    // Métodos de Criação (Create)
    System.out.println("1. Cadastrar Produto");
    // Cadastro de Eletrônico, classe filha da classe produto
    System.out.println("2. Cadastrar Eletrônico");
    System.out.println("3. Cadastrar Cliente");
    System.out.println("4. Realizar Venda");

    // Métodos de Leitura (Read)
    System.out.println("5. Listar Produtos");
    System.out.println("6. Listar Vendas");
    System.out.println("7. Listar Clientes");
    System.out.println("8. Relatório de Faturamento");
    System.out.println("9. Relatório de Estoque Mínimo");

    // Métodos de Edição (Update)
    System.out.println("10. Editar Produtos");

    // Métodos de Exclusão (Delete)
    System.out.println("11. Remover Produtos");

    System.out.println("0. Sair");
    System.out.print("Escolha uma opção: ");

    }
}
