package fpt.aptech.assimentspringboot.api;

import fpt.aptech.assimentspringboot.entity.Road;
import fpt.aptech.assimentspringboot.service.DistrictService;
import fpt.aptech.assimentspringboot.service.RoadService;
import fpt.aptech.assimentspringboot.specification.RoadSpecification;
import fpt.aptech.assimentspringboot.specification.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/roads")
@CrossOrigin("*")
public class RoadApi {
    @Autowired
    private RoadService roadService;
    @Autowired
    private DistrictService districtService;

    @GetMapping
    public ResponseEntity<List<Road>> getRoadList(@RequestParam(required = false) String name, @RequestParam(required = false) int districtId) {
        RoadSpecification spec1 = new RoadSpecification(new SearchCriteria("name", ":", name));
        RoadSpecification spec2 = new RoadSpecification(new SearchCriteria("districtId", ":", districtId));
        if(name.length() > 0 && districtId >0) {
            return ResponseEntity.ok(roadService.findAll(Specification.where(spec1).and(spec2)));
        }else if(name.length() > 0) {
            return ResponseEntity.ok(roadService.findAll(Specification.where(spec1)));
        }else if(districtId > 0) {
            return ResponseEntity.ok(roadService.findAll(Specification.where(spec2)));
        }
        return ResponseEntity.ok(roadService.findAll());
    }

    @PostMapping
    public ResponseEntity<Road> createNewRoad(@Valid @RequestBody Road road) {
        Road roadSaved = roadService.save(road);
        return ResponseEntity.ok(roadSaved);
    }
}