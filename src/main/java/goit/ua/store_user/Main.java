/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 18.10.2021
 */

package goit.ua.store_user;

import goit.ua.services.ProductServices;

public class Main {

    public static void main(String[] args) {
        ProductServices productServices = new ProductServices();
        double basket = productServices.calculateCostOfBasket("ABCDABA");
        System.out.println(basket);
    }
}
