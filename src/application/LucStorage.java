package application;

import models.util.Util;
import models.entities.Produto;
import models.entities.Estoque;
import exceptions.Excecoes;

import java.util.Locale;
import java.util.Scanner;

public class  LucStorage {
    static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Util funcao = new Util();
        Scanner userInput = new Scanner(System.in);
        String nome;
        int quant;
        double preco;


        try {
            funcao.menu();
            int opcao = funcao.obterOpcaoDoUsuario(userInput);
            while (opcao != 0){
                if (opcao > 0 && opcao <= 5){
                    if (opcao == 1){
                        nome = funcao.obterNomeDoProduto(userInput);
                        quant = funcao.obterQuantidade(userInput);
                        preco = funcao.obterPreco(userInput);
                        Produto item = new Produto(nome, quant, preco);
                        estoque.adicionarProduto(item);
                        System.out.println(" ---------------------------------------------------------------- ");
                    } else if (opcao == 2) {
                        estoque.listarProdutos();
                        System.out.println(" ---------------------------------------------------------------- ");
                    } else if (opcao == 3) {
                        System.out.println(" - Insira o nome do item que deseja atualizar os dados - ");
                        nome = funcao.obterNomeDoProduto(userInput);
                        estoque.verificaNome(nome);
                        quant = funcao.obterQuantidade(userInput);
                        preco = funcao.obterPreco(userInput);
                        estoque.atualizarProduto(nome, quant, preco);
                        System.out.println(" ---------------------------------------------------------------- ");
                    } else if (opcao == 4) {
                        System.out.println(" - Insira os dados do produto para retirada - ");
                        nome = funcao.obterNomeDoProduto(userInput);
                        estoque.verificaNome(nome);
                        quant = funcao.obterQuantidade(userInput);
                        estoque.retirarProduto(nome, quant);
                        System.out.println(" ---------------------------------------------------------------- ");
                    } else {
                        System.out.println("- Qual produto deseja remover - ");
                        nome = funcao.obterNomeDoProduto(userInput);
                        estoque.verificaNome(nome);
                        estoque.removerProduto(nome);
                        System.out.println(" ---------------------------------------------------------------- ");
                    }
                }else {
                    funcao.mensagemErro();
                }

                funcao.menu();
                opcao = funcao.obterOpcaoDoUsuario(userInput);
            }

            System.out.println("Obrigado !! Até a próxima");
            userInput.close();
        }
        catch (Excecoes e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
