package org.isep.observabilityspringbootgrafana.repository;


import org.isep.observabilityspringbootgrafana.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aubin payong ezozoh
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
}
