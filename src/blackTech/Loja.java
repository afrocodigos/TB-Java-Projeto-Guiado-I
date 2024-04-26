package blackTech;

import java.util.*;
import java.util.Scanner;

public class Loja {
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();

    public static void main(String[] args) {

        inicializarDados();

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
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    listarVendas();
                    break;
                case 6:
                    listarClientes();
                    break;
                case 7:
                    relatorioFaturamento();
                    break;
                case 8:
                    relatorioEstoqueMinimo();
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

    private static void inicializarDados() {
        // Inicializar alguns produtos
        Produto produto1 = new Produto(1, "Camiseta", 29.99, 50, 10);
        Produto produto2 = new Produto(2, "Calça Jeans", 59.99, 30, 5);
        Produto produto3 = new Produto(3, "Tênis", 99.99, 20, 3);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        // Inicializar alguns clientes
        Cliente cliente1 = new Cliente(1, "João", "123.456.789-00");
        Cliente cliente2 = new Cliente(2, "Maria", "987.654.321-00");
        Cliente cliente3 = new Cliente(3, "Pedro", "111.222.333-44");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
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

        double precoTotal = produto.getPreco() * quantidade;

        Venda venda = new Venda(vendas.size() + 1, cliente, produto, quantidade, precoTotal);

        // Adicionando a nova venda no ArrayList<>
        vendas.add(venda);

        // Retirando a quantidade da venda do produto em estoque
        produto.setEstoque(produto.getEstoque() - quantidade);

        System.out.println("Venda realizada com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - R$ " + produto.getPreco() + " - Estoque: " + produto.getEstoque());
        }
    }

    private static void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getId() + " - " + cliente.getNome() + " - R$ " + cliente.getCpf());
        }
    }

    private static void listarVendas() {
        System.out.println("Lista de Vendas:");

        for (Venda venda : vendas) {
            //double valorTotalVenda = venda.getProduto(preco) * venda.getQuantidade();
            System.out.println(venda.getId() + " - " + venda.getQuantidade() + " * " + venda.getProduto().getNome() + "(" + venda.getProduto().getPreco() + ") = " + venda.getPrecoTotal());
        }
    }

    private static void relatorioFaturamento() {
        int quantidadeVendas = vendas.size();
        int quantidadeProdutos = 0;
        double valorTotalVendas = 0.0;

        for (Venda venda : vendas) {
            quantidadeProdutos += venda.getQuantidade();
            valorTotalVendas += venda.getQuantidade() * venda.getProduto().getPreco();
        }

        System.out.println("Quantidade de Vendas: " + quantidadeVendas);
        System.out.println("Quantidade de Produtos Vendidos: " + quantidadeProdutos);
        System.out.println("Valor Total das Vendas: " + valorTotalVendas);
    }

    private static void relatorioEstoqueMinimo() {
        System.out.println("Produtos abaixo do estoque mínimo:");
        for (Produto produto : produtos) {
            if (produto.getEstoque() < produto.getEstoqueMinimo()) {
                System.out.println(produto.getId() + " - " + produto.getNome() + " - Estoque: " + produto.getEstoque() + "/" + produto.getEstoqueMinimo());
            }
        }
    }

}
