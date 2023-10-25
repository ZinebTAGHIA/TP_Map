package ma.zineb.tp_map_backend.repository;

import ma.zineb.tp_map_backend.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}