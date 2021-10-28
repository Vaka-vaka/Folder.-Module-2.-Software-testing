/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 28.10.2021
 */

package goit.ua.products;

public interface ProductSaleable<S> {
    double getPriceByQuantity(long quantity);
}
