package it.jmeza.unit_testing_spring6.product.service;

import it.jmeza.unit_testing_spring6.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    /**
     * Returns the product with the specified id.
     *
     * @param id ID of the product to retrieve.
     * @return The requested Product if found.
     */
    Optional<Product> findById(Integer id);

    /**
     * Returns all products in the database.
     *
     * @return All products in the database.
     */
    List<Product> findAll();

    /**
     * Updates the specified product, identified by its id.
     *
     * @param product The product to update.
     * @return True if the update succeeded, otherwise false.
     */
    boolean update(Product product);

    /**
     * Saves the specified product to the database.
     *
     * @param product The product to save to the database.
     * @return The saved product.
     */
    Product save(Product product);

    /**
     * Deletes the product with the specified id.
     *
     * @param id The id of the product to delete.
     * @return True if the operation was successful.
     */
    boolean delete(Integer id);
}
