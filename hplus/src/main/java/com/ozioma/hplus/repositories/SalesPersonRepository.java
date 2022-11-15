package com.ozioma.hplus.repositories;

import com.ozioma.hplus.entity.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {
}
