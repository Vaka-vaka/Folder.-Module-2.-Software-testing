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
        assertThrows(RuntimeException.class, () ->testProduct.getPriceByQuantity(0),
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
}
