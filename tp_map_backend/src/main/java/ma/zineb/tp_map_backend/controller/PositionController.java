package ma.zineb.tp_map_backend.controller;

import ma.zineb.tp_map_backend.entity.Position;
import ma.zineb.tp_map_backend.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
public class PositionController {
    @Autowired
    private PositionRepository positionRepository;

    @PostMapping("/save")
    public void save(@RequestBody Position position){
        positionRepository.save(position);
    }

    @GetMapping("/all")
    public List<Position> getAll(){
        return positionRepository.findAll();
    }

}
