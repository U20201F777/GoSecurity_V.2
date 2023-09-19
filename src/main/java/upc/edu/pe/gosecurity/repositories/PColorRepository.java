package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.PertenenciasColor;

import java.util.List;

@Repository
public interface PColorRepository extends JpaRepository <PertenenciasColor,Integer> {
    List<PertenenciasColor>findByNamePertenenciasColor(String namePertenenciasColor);
}
