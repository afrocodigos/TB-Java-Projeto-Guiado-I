package stock.control;

import java.time.LocalDate;

public class MainRunStock {

    public static void main(String[] args) throws Exception {

        Clothing clothing = new Clothing();
        clothing.setId(1);
        clothing.setName("Camiseta");
        clothing.setDescription("Camiseta de time");
        clothing.setPrice(59.90);
        clothing.setQuantity(30);
        clothing.setEntryDate(LocalDate.now());
        clothing.setSize("M");
        clothing.setType("Roupa esportiva");
        clothing.setKidsClothing(true);

        Food food = new Food();
        food.setId(2);
        food.setName("Sal");
        food.setDescription("sal rosa");
        food.setPrice(2.99);
        food.setQuantity(100);
        food.setEntryDate(LocalDate.now());
        food.setPerishable(false);
        food.setExpirationDate(LocalDate.of(2029, 4, 28));

        Food updateProduct = new Food();
        updateProduct.setId(2);
        updateProduct.setName("Sal");
        updateProduct.setDescription("sal rosa");
        updateProduct.setPrice(2.99);
        updateProduct.setQuantity(50);
        updateProduct.setEntryDate(LocalDate.now());
        updateProduct.setPerishable(false);
        updateProduct.setExpirationDate(LocalDate.of(2029, 4, 28));

        Electronic electronic = new Electronic();
        electronic.setId(3);
        electronic.setName("Alexa");
        electronic.setDescription("geração 3");
        electronic.setType("casa inteligente");
        electronic.setPrice(375.90);
        electronic.setQuantity(10);
        electronic.setEntryDate(LocalDate.now());
        electronic.setSmartProduct(true);

        Stock stock = new Stock();
        stock.addProduct(clothing);
        stock.addProduct(food);
        stock.addProduct(electronic);
        stock.getAllProducts();
        stock.getProductById(5);
        stock.updateProduct(2, updateProduct);
        stock.deleteProduct(3);
    }
}
