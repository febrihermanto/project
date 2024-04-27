package com.hcl.trade.service;

import com.hcl.trade.filter.PositionFilter;
import com.hcl.trade.filter.PositionRequest;
import com.hcl.trade.model.Position;
import org.hibernate.query.Page;

import java.util.List;

public interface PositionService {
    List<Position> getPosition();

    List<Position> getPositionWithFilter(PositionRequest positionRequest);
    Position getPositionById(String id);
}
