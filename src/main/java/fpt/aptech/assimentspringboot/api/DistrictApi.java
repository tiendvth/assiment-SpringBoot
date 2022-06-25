package fpt.aptech.assimentspringboot.api;

import fpt.aptech.assimentspringboot.entity.District;
import fpt.aptech.assimentspringboot.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/districts")
@CrossOrigin("*")
public class DistrictApi {
    @Autowired
    private DistrictService districtService;

    @GetMapping
    public List<District> getListDistrict() {
        return districtService.findAll();
    }

    @GetMapping("/seed")
    public ResponseEntity<String> seeding() {
        String[] districts = {"Đống Đa", "Hoàn Kiếm", "Ba Đình", "Hoàng Mai", "Ha bà Trưng","Cầu Giấy", "Thanh Xuân", "Hà Đông", "Long Biên", "Thanh Trì","Bắc Từ Liêm", "Nam Từ Liêm"};
        for (String district : districts) {
            District newDistrict = new District();
            newDistrict.setName(district);
            districtService.save(newDistrict);
        }
        return ResponseEntity.ok("success");
    }
}
