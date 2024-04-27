package com.hcl.trade.service;

import com.hcl.trade.exception.NoDataFoundException;
import com.hcl.trade.filter.PositionFilter;
import com.hcl.trade.filter.PositionRequest;
import com.hcl.trade.model.Position;
import com.hcl.trade.repository.PositionRepository;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public List<Position> getPosition() {
        return positionRepository.findAll();
    }

    @Override
    public List<Position> getPositionWithFilter(PositionRequest positionRequest) {
        System.out.println(positionRequest.toString());
        return new ArrayList<>();
    }

    @Override
    public Position getPositionById(String id) throws NoDataFoundException{
        Optional<Position> position = positionRepository.findById(id);
        if (!position.isPresent()) {
            throw new NoDataFoundException(id);
        }
        return position.get();
    }


}
