package juliaoStore;

public class Mercadinho {
    public static void main(String[] args) {

        Produto produto = new Produto("Arroz",10,6.40);
        Produto produto2 = new Produto("Feijão",5,8.30);
        Produto produto3 = new Produto("Carne",16,20.25);
        Produto produto4 = new Produto("Biscoito",15,3.50);
        Produto produto5 = new Produto("Aguá",20,2.50);

        Estoque estoque = new Estoque();

        Cliente cliente = new Cliente();

        System.out.println("Operações no estoque:");
        System.out.println("Adicionando produtos = ");
        estoque.adicionarProduto(produto);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);
        estoque.adicionarProduto(produto5);

        System.out.println("-----------------------------------------");

        estoque.listarProdutos();

        System.out.println("-----------------------------------------");

        System.out.println("Removendo produtos= ");
        estoque.removerProduto("Arroz");
        estoque.removerProduto("batata");

        System.out.println("-----------------------------------------");

        estoque.listarProdutos();

        System.out.println("-----------------------------------------");

        System.out.println("Operações no cleinte:");

        System.out.println("Adicionando produtos no carrinho:");
        cliente.adicionarAoCarrinho(produto,10);
        cliente.adicionarAoCarrinho(produto2,7);
        cliente.adicionarAoCarrinho(produto3,9);
        cliente.adicionarAoCarrinho(produto4,2);
        cliente.adicionarAoCarrinho(produto5,15);

        System.out.println("-----------------------------------------");

        cliente.listarCarrinho();

        System.out.println("-----------------------------------------");

        cliente.comprarProdutos();



    }
}
