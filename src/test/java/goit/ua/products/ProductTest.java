/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 19.10.2021
 */

package goit.ua.products;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    /**
     * Rigorous Test :-)
     */
    private Product testProduct;

    @Before
    public void initProduct() {
        testProduct = new Product("A", 1.25, 3, 3);
    }

    @Test
    public void testGetPriceByQuantity() {
        double expected = 1.25;
        double actual = testProduct.getPriceByQuantity(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPriceByQuantityZero() {
        assertThrows(RuntimeException.class, () -> testProduct.getPriceByQuantity(0),
                "Amount can't be less than 1");
    }

    @Test
    public void testGetPriceByQuantityMinus() {
        assertThrows(RuntimeException.class, () -> testProduct.getPriceByQuantity(-1),
                "Quantity can't be less than 1");
    }

    @Test
    public void testCompareProducts() {
        Product similar = new Product("A", 1.25, 3, 3);
        assertEquals(similar, testProduct);
    }

    @Test
    public void testDifferentCompareProducts() {
        Product product = new Product("D", 0.75);
        assertNotEquals(product, testProduct);

        Product anotherPrice = new Product("A", 2, 3, 3);
        assertNotEquals(anotherPrice, testProduct);

        Product anotherPromotionalQuantity = new Product("A", 1.25, 8, 3);
        assertNotEquals(anotherPromotionalQuantity, testProduct);

        Product anotherPromotionalPrice = new Product("A", 1.25, 3, 9);
        assertNotEquals(anotherPromotionalPrice, testProduct);
    }

    @Test
    public void testCompareHashCode() {
        Product product = testProduct;
        assertEquals(product.hashCode(), testProduct.hashCode());

        Product newProduct = new Product("A", 1.25, 3, 3);
        assertEquals(newProduct.hashCode(), testProduct.hashCode());
    }

    @Test
    public void testCompareDifferentProduct() {
        Product product = new Product("D", 0.75);
        assertNotEquals(product.hashCode(), testProduct.hashCode());
    }
}
