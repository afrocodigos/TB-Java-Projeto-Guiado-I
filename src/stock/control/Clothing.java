package stock.control;

import java.time.LocalDate;
import java.util.Date;

public class Clothing extends Product {

    private String size;
    private String type;
    private boolean kidsClothing;

    @Override
    public void showProduct() {
        super.showProduct();
        System.out.println("Tamanho: " + this.size);
        System.out.println("Tipo de roupa: " + this.type);
        System.out.println(isForKids());
        System.out.println("=============================================");
    }

    private String isForKids() {
        if (kidsClothing) {
            return "Roupa infantil.";
        }
        return "Roupa não é infantil.";
    }

    public Clothing() {}
    public Clothing(int id, String name, String description, int quantity, double price, LocalDate entryDate, String size, String type, boolean kidsClothing) {
        super(id, name, description, quantity, price, entryDate);
        this.size = size;
        this.type = type;
        this.kidsClothing = kidsClothing;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKidsClothing(boolean kidsClothing) {
        this.kidsClothing = kidsClothing;
    }

}
