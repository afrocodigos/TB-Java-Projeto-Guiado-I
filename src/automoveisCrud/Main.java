package automoveisCrud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRUDCarro crud = new CRUDCarro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n########## Escolha uma opção: ##########");
            System.out.println("1. Adiciona carro");
            System.out.println("2. Lista carros");
            System.out.println("3. Atualiza carro");
            System.out.println("4. Deleta carro");
            System.out.println("5. Lista carros no estoque");
            System.out.println("6. Atualiza quantidade de carros no estoque");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***** Digite a marca do carro: *****");
                    String marca = scanner.next();
                    System.out.println("***** Digite o modelo do carro: *****");
                    String modelo = scanner.next();
                    System.out.println("***** Digite o ano do carro: *****");
                    int ano = scanner.nextInt();
                    crud.adicionarCarro(marca, modelo, ano);
                    break;
                case 2:
                    System.out.println("***** Listando os carros: *****");
                    crud.listarCarros();
                    break;
                case 3:
                    System.out.println("***** Digite o ID do carro que deseja atualizar:***** ");
                    int idAtualizar = scanner.nextInt();
                    System.out.println("***** Digite a nova marca do carro: *****");
                    String novaMarca = scanner.next();
                    System.out.println("***** Digite o novo modelo do carro:*****");
                    String novoModelo = scanner.next();
                    System.out.println("***** Digite o novo ano do carro:*****");
                    int novoAno = scanner.nextInt();
                    try {
                        crud.atualizarCarro(idAtualizar, novaMarca, novoModelo, novoAno);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("***** Digite o ID do carro que deseja deletar: *****");
                    int idDeletar = scanner.nextInt();
                    try {
                        crud.deletarCarro(idDeletar);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("***** Listando carros no estoque: *****");
                    crud.listarCarrosNoEstoque();
                    break;
                case 6:
                    System.out.println("***** Digite o ID do carro que deseja atualizar a quantidade no estoque: *****");
                    int idCarroEstoque = scanner.nextInt();
                    System.out.println("***** Digite a nova quantidade: *****");
                    int novaQuantidade = scanner.nextInt();
                    crud.atualizarQuantidadeNoEstoque(idCarroEstoque, novaQuantidade);
                    break;
                case 0:
                    System.out.println("##### Saindo :) #####");
                    break;
                default:
                    System.out.println("##### Opção inválida. #####");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}