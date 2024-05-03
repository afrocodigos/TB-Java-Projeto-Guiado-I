package juliaoStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String chave = "af123";
        boolean condicao = false;
        Menu opcoesMenu = new Menu();
        Scanner read = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        while (!condicao) {
            System.out.println("Digite a senha do sistema:");
            String senha = read.nextLine();
            if (senha.equals(chave)) {
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
