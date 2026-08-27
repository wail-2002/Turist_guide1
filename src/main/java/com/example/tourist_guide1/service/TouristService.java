package com.example.tourist_guide1.service;

import com.example.tourist_guide1.model.TouristAttraction;
import com.example.tourist_guide1.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAll() {
        return touristRepository.getAll();
    }

    public TouristAttraction getByName(String name) {
        return touristRepository.getByName(name);
    }

    public TouristAttraction add(TouristAttraction attraction) {
        return touristRepository.add(attraction);
    }

    public TouristAttraction update(String name, TouristAttraction attraction) {
        return touristRepository.update(name, attraction);
    }

    public void delete(String name) {
        touristRepository.delete(name);
    }
}