package com.hcl.trade.controller;

import com.hcl.trade.exception.NoDataFoundException;
import com.hcl.trade.filter.PositionFilter;
import com.hcl.trade.filter.PositionRequest;
import com.hcl.trade.model.Position;
import com.hcl.trade.service.PositionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
    private PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping()
    public ResponseEntity<List<Position>> getPositions(){
       List<Position> positions = positionService.getPosition();
       return new ResponseEntity<>(positions, HttpStatus.OK);
    }

    @GetMapping("/v2")
    public ResponseEntity<List<Position>> getPositionsWithFilter(@RequestBody PositionRequest positionRequest){
        List<Position> positions = positionService.getPositionWithFilter(positionRequest);
        return new ResponseEntity<>(positions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Position> getPositionById(@PathVariable("id") String id) throws NoDataFoundException {
        Position position = positionService.getPositionById(id);
        return new ResponseEntity<>(position, HttpStatus.OK);
    }
}