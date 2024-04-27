package com.hcl.trade.repository;

import com.hcl.trade.model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,String> {
    Page<Position> findAll(Pageable pageable);
}
