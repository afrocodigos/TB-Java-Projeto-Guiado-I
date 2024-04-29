package model.entities;

import model.exceptions.Excecoes;

import java.util.Scanner;

public class Util {

    public void menu(){
        System.out.println("----------   Bem-vindo à LucStorage   ----------");
        System.out.println(" -- O QUE DESEJA REALIZAR? --");
        System.out.println("1 - Adicionar item ao storage | 2 - Ver o storage");
        System.out.println("3 - Atualizar item do storage | 4 - Para retirar item");
        System.out.println("5 - Para remover item         | 0 - Para sair");
    }

    public int obterOpcaoDoUsuario(Scanner scanner) {
        System.out.print("--> ");
        return scanner.nextInt();
    }

    public String obterNomeDoProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public int obterQuantidade(Scanner scanner) {
        System.out.print("Quantidade: ");
        return scanner.nextInt();
    }

    public double obterPreco(Scanner scanner) {
        System.out.print("Preço UN: R$ ");
        return scanner.nextDouble();
    }

    public String mensagemErro(){
        throw new Excecoes("Opção inválida, verifique se digitou corretamente. Até mais !");
    }
}
