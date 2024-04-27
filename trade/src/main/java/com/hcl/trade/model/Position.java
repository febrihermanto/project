package com.hcl.trade.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String status;
    // Many-to-one relationship with Instrument
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "instrument_id", nullable = false)
    private Instrument instrument;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;
}
