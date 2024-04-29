package stock.control;

import java.time.LocalDate;

public class Electronic extends Product {
    private String type;
    private boolean smartProduct;


    public Electronic() {}
    public Electronic(int id, String name, String description, int quantity, double price, LocalDate entryDate, String type, boolean smartProduct) {
        super(id, name, description, quantity, price, entryDate);
        this.type = type;
        this.smartProduct = smartProduct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String isSmartProduct() {
        if (smartProduct) {
            return "É um produto smart.";
        }
        return "Não é um produto smart.";
    }

    public void setSmartProduct(boolean smartProduct) {
        this.smartProduct = smartProduct;
    }

    @Override
    public void showProduct() {
        super.showProduct();
        System.out.println("Tipo de produto: " + this.getType());
        System.out.println("É um produto smart? " + this.isSmartProduct());
    }
}
