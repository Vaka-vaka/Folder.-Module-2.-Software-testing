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
    public void testCalculateCostOfBasket() {
        String basket = "ABCDABA";
        double expected = 13.25;
        double actual = testProductServices.calculateCostOfBasket(basket);
        assertEquals(expected, actual);

        String basketIsNotNewA = "bcdB";
        double expectedA = 10.25;
        double actualA = testProductServices.calculateCostOfBasket(basketIsNotNewA);
        assertEquals(expectedA, actualA);
    }

    @Test
    public void testCalculateCostOfBasketZero() {
        double expected = 0;
        double actual = testProductServices.calculateCostOfBasket(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testCostUnknownProducts() {
        String basket = "mfgOUT";
        double expected = 0;
        double actual = testProductServices.calculateCostOfBasket(basket);
        assertEquals(expected, actual);

        String basketWithSpace = "ABCD ABA";
        String basketWithSpaceAndWithCorrectAndUnknown = "ABcD NGHABATYU";
        double expectedSpaceAndCorrect = 13.25;

        double actualSpace = testProductServices.calculateCostOfBasket(basketWithSpace);
        assertEquals(expectedSpaceAndCorrect, actualSpace);

        double actualWithSpaceAndWithCorrectAndUnknown = testProductServices
                .calculateCostOfBasket(basketWithSpaceAndWithCorrectAndUnknown);
        assertEquals(expectedSpaceAndCorrect, actualWithSpaceAndWithCorrectAndUnknown);

        String basketNumber = "ABCDAB a345";
        double expectedNumber = 13.25;
        double actualNumber = testProductServices.calculateCostOfBasket(basketNumber);
        assertEquals(expectedNumber, actualNumber);
    }
}
