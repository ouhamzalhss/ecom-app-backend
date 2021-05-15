package com.ouhamza.ecommerce.dao;

import com.ouhamza.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * @author Lhouceine OUHAMZA
 */
@CrossOrigin()
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryCode(@Param("code") String code);
}
