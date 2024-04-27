package com.hcl.trade.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String type;
    private String name;
    private String value;
}
