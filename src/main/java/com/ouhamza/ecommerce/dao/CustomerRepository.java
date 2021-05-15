package com.ouhamza.ecommerce.dao;

import com.ouhamza.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lhouceine OUHAMZA
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
