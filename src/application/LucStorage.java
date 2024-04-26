package application;

import model.entities.Util;
import model.entities.Produto;
import model.entities.Estoque;
import model.exceptions.Excecoes;

import java.util.Locale;
import java.util.Scanner;

public class LucStorage {
    static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Util funcao = new Util();
        Scanner sc = new Scanner(System.in);

        try {
            funcao.menu();

            int opcao = sc.nextInt();
            while (opcao != 5){
                if (opcao <= 0 || opcao > 4){
                    System.out.println("Opção inválida, tente novamente");
                }
                if (opcao == 1){
                    System.out.print("Nome do produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int quant = sc.nextInt();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    Produto item = new Produto(nome, quant, preco);
                    estoque.adicionarProduto(item);
                } else if (opcao == 2) {
                    estoque.listarProdutos();
                } else if (opcao == 3) {
                    System.out.print("Qual produto deseja atualizar: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuant = sc.nextInt();
                    System.out.print("Novo preço: ");
                    double novoPreco = sc.nextDouble();
                    estoque.atualizarProduto(nome, novaQuant, novoPreco);
                } else {
                    System.out.print("Qual produto deseja remover: ");
                    sc.nextLine();
                    String nomeParaRemover = sc.nextLine();
                    estoque.removerProduto(nomeParaRemover);
                }

                System.out.print("-->");
                opcao = sc.nextInt();
            }

            System.out.println("Obrigado !! Até a próxima");
            sc.close();
        }
        catch (Excecoes e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
