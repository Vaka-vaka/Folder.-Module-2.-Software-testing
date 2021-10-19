/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 19.10.2021
 */

package goit.ua.products;

import org.junit.*;

public class ProductTest {
    /**
     * Rigorous Test :-)
     */
    private Product testProduct;

    @Before
    public void initProduct() {
        testProduct = new Product("A", 1.25, 3, 3);
    }

    public void testGetPriceByQuantity() {

    }
}
