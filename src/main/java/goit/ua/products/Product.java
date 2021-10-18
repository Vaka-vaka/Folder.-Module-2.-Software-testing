/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 18.10.2021
 */

package goit.ua.products;

import java.util.Objects;

public class Product implements ProductId<String> {

    private final String id;
    private final double price;
    private final int PromotionalQuantity;
    private final double PromotionalPrice;

    public Product(String id, double price, int promotionalQuantity, double promotionalPrice) {
        this.id = id;
        this.price = price;
        PromotionalQuantity = promotionalQuantity;
        PromotionalPrice = promotionalPrice;
    }

    public Product(String id, double price) {
        this(id, price, 1, price);
    }

    public String getId() {
        return id;
    }

    public double getPriceByQuantity(long quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("No products were chosen");
        }
        if (quantity < PromotionalQuantity) {
            return (quantity * price);
        } else {
            return (quantity / PromotionalQuantity) * PromotionalPrice
                    + (quantity % PromotionalQuantity) * price;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0
                && PromotionalQuantity == product.PromotionalQuantity
                && Double.compare(product.PromotionalPrice, PromotionalPrice) == 0
                && id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, PromotionalQuantity, PromotionalPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", PromotionalQuantity=" + PromotionalQuantity +
                ", PromotionalPrice=" + PromotionalPrice +
                '}';
    }
}
