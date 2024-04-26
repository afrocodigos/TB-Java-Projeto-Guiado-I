package blackTech;

import java.util.*;
import java.util.Scanner;

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
                    cadastrarProduto();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    realizarVenda();
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

    private static void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do produto: ");
        int id = scanner.nextInt();
        System.out.print("Nome do produto: ");
        String nome = scanner.next();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int estoque = scanner.nextInt();
        System.out.print("Estoque mínimo do produto: ");
        int estoqueMinimo = scanner.nextInt();

        Produto produto = new Produto(id, nome, preco, estoque, estoqueMinimo);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID do Cliente: ");
        int id = scanner.nextInt();
        System.out.print("Nome do Cliente: ");
        String nome = scanner.next();
        System.out.print("Cpf do Cliente:  ");
        String cpf = scanner.next();

        Cliente cliente = new Cliente(id, nome, cpf);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    // O método realizarVenda utiliza os atributos das Classes Produto e Cliente,
    // essas instâncias são utilizadas para validação da venda
    private static void realizarVenda() {
        Scanner scanner = new Scanner(System.in);

        // O código percorre o Array clientes<> e encontra o mesmo ID passa para próxima etapa
        System.out.print("ID do cliente: ");
        int clienteId = scanner.nextInt();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getId() == clienteId) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.print("ID do produto: ");
        int produtoId = scanner.nextInt();
        Produto produto = null;
        for (Produto p : produtos) {
            if (p.getId() == produtoId) {
                produto = p;
                break;
            }
        }
        if (produto == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.print("Quantidade a ser vendida: ");
        int quantidade = scanner.nextInt();

        // Validação de quantidade em estoque antes de efetuar a venda
        if (quantidade > produto.getEstoque()) {
            System.out.println("Quantidade insuficiente em estoque!");
            return;
        }

        Venda venda = new Venda(vendas.size() + 1, cliente, produto, quantidade);

        // Adicionando a nova venda no ArrayList<>
        vendas.add(venda);

        // Retirando a quantidade da venda do produto em estoque
        produto.setEstoque(produto.getEstoque() - quantidade);

        System.out.println("Venda realizada com sucesso!");
    }

}
