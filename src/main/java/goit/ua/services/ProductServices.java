/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 18.10.2021
 */

package goit.ua.services;

import goit.ua.products.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductServices {

    private final Map<String, Product> productMap = new HashMap<>();

    {
        productMap.put("A", new Product("A", 1.25, 3, 3.00));
        productMap.put("B", new Product("B", 4.25));
        productMap.put("C", new Product("C", 1.00, 6, 5.00));
        productMap.put("D", new Product("D", 0.75));
    }

    private boolean correctBasket(String basket) {
        return basket != null && !basket.isEmpty();
    }

    private String adjustTheBasket(String basket) {
        if (correctBasket(basket)) {
            return Arrays.stream(basket.toUpperCase()
                    .split(" "))
                    .filter(productMap :: containsKey)
                    .collect(Collectors.joining());
        }
        return basket;
    }
}
