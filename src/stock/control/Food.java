package stock.control;

import java.time.LocalDate;
import java.util.Date;


public class Food extends Product {
    private boolean isPerishable;
    private LocalDate expirationDate;

    public Food() {}
    public Food(int id, String name, String description, int quantity, double price, LocalDate entryDate, boolean isPerishable, LocalDate expirationDate) {
        super(id, name, description, quantity, price, entryDate);
        this.isPerishable = isPerishable;
        this.expirationDate = expirationDate;
    }

    public String isPerishable() {
        if (isPerishable) {
            return "Alimento perecível";
        }
        return "Alimento não perecível";
    }

    public void setPerishable(boolean perishable) {
        isPerishable = perishable;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void showProduct() {
        super.showProduct();
        System.out.println("Data de vencimento: " + this.getExpirationDate());
        System.out.println("Alimento perecível? " + isPerishable());
    }
}
