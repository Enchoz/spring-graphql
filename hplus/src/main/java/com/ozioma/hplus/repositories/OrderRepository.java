package com.ozioma.hplus.repositories;

import com.ozioma.hplus.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
