/**
 * Homework. Module 2. jUnitTest
 *
 * @autor Valentin Mozul
 * @version of 28.10.2021
 */

package goit.ua.repository;

import goit.ua.products.ProductId;

import java.util.Optional;

public interface Storage <Y extends ProductId<ID>, ID>{
    Optional<Y> findById(ID id);
}
