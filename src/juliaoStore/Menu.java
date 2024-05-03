package juliaoStore;

import java.util.Scanner;

public class Menu {

    Produto produto = new Produto();
    Estoque estoque = new Estoque();
    Scanner read = new Scanner(System.in);

    public void menuEstoque() {
        System.out.println("----------------------");
        System.out.println("Menu Estoque");
        System.out.println(
                "1-Cadastrar Produto\n2-Listar Estoque\n3-Atualiza Estoque\n4-Pesquisar produto no estoque\n5-Excluir Produto");
        System.out.println("----------------------");

        int opcao = read.nextInt();
        read.nextLine();
        try {

        } catch (Exception e) {

            System.out.println("operação invalida");

        }

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar Livro");
                System.out.println("Qual o nome do Livro ?");
                String nome = read.nextLine();
                System.out.println("Qual a quantidade do estoque de produto ?");
                int quantidade = read.nextInt();
                read.nextLine();
                System.out.println("Qual o preço desse produto ?");
                float preco = read.nextInt();
                read.nextLine();
                System.out.println("Qual o autor desse produto ?");
                String autor = read.nextLine();
                System.out.println("Qual o ano de prublicação do livro ?");
                int ano = read.nextInt();
                read.nextLine();
                produto = new Produto(nome, quantidade, preco, autor, ano);
                estoque.adicionarProduto(produto);
                break;

            case 2:
                System.out.println("Lista de Produto em Estoque");
                estoque.listarProdutos();

                break;
            case 3:
                atualizarEstoque();
                break;
            case 4:
                pesquisarProduto();

                break;
            case 5:
                excluirProduto();
                break;

        }

    }

    public void atualizarEstoque() {

        System.out.println("----------------------");
        System.out.println("Atualizar Estoque");
        System.out.println("----------------------");

        System.out.println("Digite nome do produto");
        String nome = read.nextLine();
        estoque.buscarProduto(nome);
        System.out.println("Digite os novos dados ");
        System.out.println("Qual o nome do Livro ?");
        nome = read.nextLine();
        System.out.println("Qual a quantidade do estoque de produto ?");
        int quantidade = read.nextInt();
        read.nextLine();
        System.out.println("Qual o preço desse produto ?");
        float preco = read.nextInt();
        read.nextLine();
        System.out.println("Qual o autor desse produto ?");
        String autor = read.nextLine();
        System.out.println("Qual o ano de prublicação do livro ?");
        int ano = read.nextInt();
        read.nextLine();

        estoque.atualizarProduto(nome, quantidade, preco, autor, ano);

    }

    public void pesquisarProduto() {

        System.out.println("----------------------");
        System.out.println("Pesquisar Produto");
        System.out.println("----------------------");

        System.out.println("Digite nome do produto");
        String nome = read.nextLine();
        estoque.buscarProduto(nome);
    }

    public void excluirProduto() {

        System.out.println("----------------------");
        System.out.println("Excluir Produto");
        System.out.println("----------------------");

        System.out.println("Digite nome do produto que será removido");
        String nome = read.nextLine();
        estoque.buscarProduto(nome);
        estoque.removerProduto(nome);
    }

}
