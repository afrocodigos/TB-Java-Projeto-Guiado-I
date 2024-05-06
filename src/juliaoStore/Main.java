package juliaoStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean condicao = false;
        Menu opcoesMenu = new Menu();
        Scanner read = new Scanner(System.in);

        while (!condicao) {
            System.out.println("Digite a senha do sistema:");
            String senhaDigitada = read.nextLine();
            if (senhaDigitada.equals(Senha.getSenha())) {
                condicao = true;
            } else {
                System.out.println("Senha incorreta");
            }

        }

        try {
            while (condicao) {
                System.out.println("-------------------------------------------------");
                System.out.println(
                        "Seja bem-vido ao Sistema de Estoque\nEscolha uma opção\n1-Menu Estoque\n2-Sair");
                System.out.println("-------------------------------------------------");

                int opcao = read.nextInt();
                read.nextLine();

                switch (opcao) {
                    case 1:

                        opcoesMenu.menuEstoque();
                        break;
                    case 2:
                        condicao = false;
                        System.out.println("Volte sempre!");
                        break;

                }

            }

        } catch (InputMismatchException e) {
            System.out.println("operação inavalida");
            read.nextLine();
        }

    }

}
