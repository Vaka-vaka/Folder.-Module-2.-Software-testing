/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 20.10.2021
 */

package goit.ua.services;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServicesTest {
    /**
     * Rigorous Test :-)
     */
    private ProductServices testProductServices;

    @Before
    public void init() {
        testProductServices = new ProductServices();
    }

    @Test
    public void testCalculateTheCostOfTheBasket() {
        String basket = "ABCDABA";
        double expected = 13.25;
        double actual = testProductServices.calculateTheCostOfTheBasket(basket);
        assertEquals(expected, actual);

        String basketIsNotNewA = "bcdB";
        double expectedA = 10.25;
        double actualA = testProductServices.calculateTheCostOfTheBasket(basketIsNotNewA);
        assertEquals(expectedA, actualA);
    }

    @Test
    public void testCalculateTheCostOfTheBasketZero() {
        double expected = 0;
        double actual = testProductServices.calculateTheCostOfTheBasket(null);
        assertEquals(expected, actual);
    }


}
