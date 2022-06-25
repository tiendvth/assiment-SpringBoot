package fpt.aptech.assimentspringboot.service;

import fpt.aptech.assimentspringboot.entity.Road;
import fpt.aptech.assimentspringboot.repository.RoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoadService {
    @Autowired
    private RoadRepository roadRepository;

    public List<Road> findAll(Specification specification) {
        return roadRepository.findAll(specification);
    }

    public List<Road> findAll() {
        return roadRepository.findAll();
    }

    public Road save(Road road) {
        return roadRepository.save(road);
    }

    public Optional<Road> findById(int id) {
        return roadRepository.findById(id);
    }

    public List<Road> findByNameContaining(String name) {
        return roadRepository.findByNameContaining(name);
    }

    public List<Road> findByDistrictId(int districtId) {
        return roadRepository.findByDistrictIdEquals(districtId);
    }
}
