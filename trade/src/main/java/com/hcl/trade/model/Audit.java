package com.hcl.trade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String transactionRef;
    private String tradeType;
    private LocalDateTime transactionDate;

}
