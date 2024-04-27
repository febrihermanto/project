package com.hcl.trade.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
}
