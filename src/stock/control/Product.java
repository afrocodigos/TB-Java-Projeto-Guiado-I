package stock.control;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private LocalDate entryDate;

    public Product() {}

    public Product(int id, String name, String description, int quantity, double price, LocalDate entryDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.entryDate = entryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public void showProduct() {
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.name);
        System.out.println("Descrição: " + this.description);
        System.out.println("Preço: " + this.price);
        System.out.println("Entrada no estoque: " + this.entryDate);
        System.out.println("Quantidade: " + this.quantity);
    }
}
