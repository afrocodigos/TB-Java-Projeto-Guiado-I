package stock.control;



import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Produto adicionado");
    }

    public void getAllProducts() {
        System.out.println("=========== LISTA DE PRODUTOS ===========");
        System.out.println("== QUANTIDADE DE PRODUTOS: " + products.size() + " ==");
        for (Product product : products) {
            product.showProduct();
        }
    }

    public void getProductById(int id) {
        try {
            for (Product product : products) {
                if (id == product.getId()) {
                    System.out.println("=========== PRODUTO IDENTIFICADO ===========");
                    product.showProduct();
                    break;
                }
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("ID NÃO ENCONTRADO");
        }
    }

    public void updateProduct(int id, Product updatedProduct) {
        try {
            boolean found = false;
            for (Product product : products) {
                if (product.getId() == id) {
                    int index = products.indexOf(product);
                    products.set(index, updatedProduct);
                    found = true;
                    System.out.println("Produto atualizado com sucesso:");
                    updatedProduct.showProduct();
                    break;
                }
            }
            if (!found) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Produto com o ID " + id + " não encontrado.");
        }
    }

    public void deleteProduct(int id) {
        try {
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                if (id == product.getId()) {
                    products.remove(i);
                    System.out.println("Produto removido com sucesso");
                    return;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Produto informado não existe em estoque");
        }
    }
}
