package com.hcl.trade;

import com.hcl.trade.model.Position;
import com.hcl.trade.repository.PositionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class PositionServiceTest {

    List<Position> data;

    @Mock
    private PositionRepository positionRepository;

    @BeforeEach
    public void setUp() {
        data = new ArrayList();
    }
}
