package fpt.aptech.assimentspringboot.service;

import fpt.aptech.assimentspringboot.entity.District;
import fpt.aptech.assimentspringboot.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> findAll() {
        return districtRepository.findAll();
    }

    public Optional<District> findById(int id) {
        return districtRepository.findById(id);
    }

    public District save(District district) {
        return districtRepository.save(district);
    }
}