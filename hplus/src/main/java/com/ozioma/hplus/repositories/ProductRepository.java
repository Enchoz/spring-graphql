
package com.ozioma.hplus.repositories;

import com.ozioma.hplus.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
