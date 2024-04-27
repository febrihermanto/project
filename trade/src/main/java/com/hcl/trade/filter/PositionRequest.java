package com.hcl.trade.filter;

import lombok.Data;

@Data
public class PositionRequest {
    PositionFilter filters;
    Sort sort;
    Pagination pagination;
}
