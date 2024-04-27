package com.hcl.trade.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "portfolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private String name;
    private Double value;
    private String strategy;
    private String performance;
}
