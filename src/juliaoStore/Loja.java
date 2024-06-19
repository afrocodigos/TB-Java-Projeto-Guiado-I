package juliaoStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loja {
    private static Estoque estoque = new Estoque();
    private static CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = solicitarOpcaoMenu();

            switch (opcao) {
                case 1:
                    adicionarProdutoEstoque();
                    break;
                case 2:
                    listarProdutosEstoque();
                    break;
                case 3:
                    atualizarProdutoEstoque();
                    break;
                case 4:
                    removerProdutoEstoque();
                    break;
                case 5:
                    adicionarProdutoCarrinho();
                    break;
                case 6:
                    removerProdutoCarrinho();
                    break;
                case 7:
                    listarProdutosCarrinho();
                    break;
                case 8:
                    finalizarCompra();
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Adicionar produto ao estoque");
        System.out.println("2. Listar produtos no estoque");
        System.out.println("3. Atualizar produto no estoque");
        System.out.println("4. Remover produto do estoque");
        System.out.println("5. Adicionar produto ao carrinho");
        System.out.println("6. Remover produto do carrinho");
        System.out.println("7. Listar produtos no carrinho");
        System.out.println("8. Finalizar compra");
        System.out.println("9. Sair");
        System.out.print("Opção: ");
    }

    private static int solicitarOpcaoMenu() {
        while (true) {
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();
                return opcao;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Entrada inválida! Digite um número correspondente à opção desejada.");
                System.out.print("Opção: ");
            }
        }
    }

    private static void adicionarProdutoEstoque() {
        String nome = solicitarDadosComRepeticao("Nome do produto (ou 'sair' para cancelar):");

        if ("sair".equalsIgnoreCase(nome.trim())) {
            return; 
        }

        int quantidade = solicitarInteiroComRepeticao("Quantidade do produto:");

        double preco = solicitarDoubleComRepeticao("Preço do produto:");

        Produto produto = new Produto(nome, quantidade, preco);
        estoque.adicionarProduto(produto);
    }

    private static void listarProdutosEstoque() {
        estoque.listarProdutos();
    }

    private static void atualizarProdutoEstoque() {
        String nome = solicitarDadosComRepeticao("Nome do produto a ser atualizado:");

        if ("sair".equalsIgnoreCase(nome.trim())) {
            return;
        }

        int quantidade = solicitarInteiroComRepeticao("Nova quantidade:");

        double preco = solicitarDoubleComRepeticao("Novo preço:");

        estoque.atualizarProduto(nome, quantidade, preco);
    }

    private static void removerProdutoEstoque() {
        String nome = solicitarDadosComRepeticao("Nome do produto a ser removido:");
        estoque.removerProduto(nome);
    }

    private static void adicionarProdutoCarrinho() {
        String nome = solicitarDadosComRepeticao("Nome do produto:");

        if ("sair".equalsIgnoreCase(nome.trim())) {
            return; 
        }

        Produto produto = estoque.buscarProdutoPorNome(nome);
        if (produto != null) {
            int quantidade = solicitarInteiroComRepeticao("Quantidade:");

            carrinho.adicionarProduto(produto, quantidade);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    private static void removerProdutoCarrinho() {
        String nome = solicitarDadosComRepeticao("Nome do produto:");

        if ("sair".equalsIgnoreCase(nome.trim())) {
            return; 
        }

        Produto produto = estoque.buscarProdutoPorNome(nome);
        if (produto != null) {
            int quantidade = solicitarInteiroComRepeticao("Quantidade:");

            carrinho.removerProduto(produto, quantidade);
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    private static void listarProdutosCarrinho() {
        carrinho.listarProdutos();
    }

    private static void finalizarCompra() {
        double total = carrinho.calcularTotalCompra();
        System.out.println("Total da compra: R$" + total);
        carrinho.limparCarrinho();
        System.out.println("Compra finalizada!");
    }

    private static String solicitarDadosComRepeticao(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            String input = scanner.nextLine();

            if ("sair".equalsIgnoreCase(input.trim())) {
                return "sair"; 
            } else if (!input.trim().isEmpty()) {
                return input.trim(); 
            } else {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        }
    }

    private static int solicitarInteiroComRepeticao(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + " ");
                String input = scanner.nextLine().trim();
    
                if ("sair".equalsIgnoreCase(input)) {
                    return -1;
                }
    
                int valor = Integer.parseInt(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Valor deve ser maior que zero. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro válido.");
            }
        }
    }
    

    private static double solicitarDoubleComRepeticao(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + " ");
                double input = scanner.nextDouble();
                scanner.nextLine(); 
                if (input > 0.0) {
                    return input; 
                } else {
                    System.out.println("Valor deve ser maior que zero. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número decimal.");
                scanner.nextLine(); 
            }
        }
    }
}
