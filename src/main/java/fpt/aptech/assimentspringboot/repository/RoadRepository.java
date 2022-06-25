package fpt.aptech.assimentspringboot.repository;

import fpt.aptech.assimentspringboot.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoadRepository extends JpaRepository<Road, Integer>, JpaSpecificationExecutor<Road> {
    List<Road> findByNameContaining(String name);
    List<Road> findByDistrictIdEquals(int districtId);
}