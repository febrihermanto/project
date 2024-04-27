package com.hcl.trade.filter;

import lombok.Data;

@Data
public class PositionFilter {
    private String status;
    private String instrumentType;
    private String instrumentId;
}