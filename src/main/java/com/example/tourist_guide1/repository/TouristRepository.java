package com.example.tourist_guide1.repository;
import com.example.tourist_guide1.model.TouristAttraction;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
public class TouristRepository {

    @Repository
    public interface TouristAttractionRepository
            extends JpaRepository<TouristAttraction, Long> {
    }
}
