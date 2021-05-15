package com.ouhamza.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author <a href="https://github.com/ouhamzalhss"> Lhouceine OUHAMZA </a>
 */

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String city;

    private String state;

    private String street;

    private String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;
}
