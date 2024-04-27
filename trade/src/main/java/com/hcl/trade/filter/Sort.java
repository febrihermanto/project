package com.hcl.trade.filter;

import lombok.Data;

@Data
public class Sort {
    private final String ASC = "ASC";
    private String field;
    private String direction = ASC;
}
