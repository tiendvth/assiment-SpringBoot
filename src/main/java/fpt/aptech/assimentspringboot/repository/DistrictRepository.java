package fpt.aptech.assimentspringboot.repository;

import fpt.aptech.assimentspringboot.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
