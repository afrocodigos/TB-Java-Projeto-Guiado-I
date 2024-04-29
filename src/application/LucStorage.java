package application;

import model.entities.Util;
import model.entities.Produto;
import model.entities.Estoque;
import model.exceptions.Excecoes;

import java.util.Locale;
import java.util.Scanner;

public class  LucStorage {
    static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Util funcao = new Util();
        Scanner userInput = new Scanner(System.in);

        try {
            funcao.menu();

            int opcao = funcao.obterOpcaoDoUsuario(userInput);
            while (opcao != 0){
                if (opcao > 0 && opcao <= 5){
                    if (opcao == 1){
                        String nome = funcao.obterNomeDoProduto(userInput);
                        int quant = funcao.obterQuantidade(userInput);
                        double preco = funcao.obterPreco(userInput);
                        Produto item = new Produto(nome, quant, preco);
                        estoque.adicionarProduto(item);
                    } else if (opcao == 2) {
                        estoque.listarProdutos();
                    } else if (opcao == 3) {
                        System.out.println(" - Insira os novos dados do produto para atualizar - ");
                        String nome = funcao.obterNomeDoProduto(userInput);
                        estoque.verificaNome(nome);
                        int novaQuant = funcao.obterQuantidade(userInput);
                        double novoPreco = funcao.obterPreco(userInput);
                        estoque.atualizarProduto(nome, novaQuant, novoPreco);
                    } else if (opcao == 4) {
                        System.out.println(" - Insira os dados do produto para retirada - ");
                        String nome = funcao.obterNomeDoProduto(userInput);
                        int quantidade = funcao.obterQuantidade(userInput);
                        estoque.retirarProduto(nome, quantidade);
                    } else {
                        System.out.println("- Qual produto deseja remover - ");
                        String nomeParaRemover = funcao.obterNomeDoProduto(userInput);
                        estoque.removerProduto(nomeParaRemover);
                    }
                }else {
                    funcao.mensagemErro();
                }

                System.out.print("O que deseja: ");
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
