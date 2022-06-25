package fpt.aptech.assimentspringboot.api;

import fpt.aptech.assimentspringboot.entity.District;
import fpt.aptech.assimentspringboot.entity.Road;
import fpt.aptech.assimentspringboot.entity.myEnum.RoadStatus;
import fpt.aptech.assimentspringboot.service.DistrictService;
import fpt.aptech.assimentspringboot.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/api/v1/seed/generate")
public class SeedApi {
    @Autowired
    private DistrictService districtService;
    @Autowired
    private RoadService roadService;

    @GetMapping
    @Query(
            value = "TRUNCATE TABLE roads; TRUNCATE TABLE districts;",
            nativeQuery = true
    )

    public ResponseEntity<String> seeding() {
        String[] districts = {"Đống Đa", "Hoàn Kiếm", "Ba Đình", "Hoàng Mai", "Ha bà Trưng","Cầu Giấy", "Thanh Xuân", "Hà Đông", "Long Biên", "Thanh Trì","Bắc Từ Liêm", "Nam Từ Liêm"};
        for (String district : districts) {
            districtService.save(District.builder()
                    .name(district).build());
        }
        roadService.save(Road.builder()
                .name("Tây Sơn")
                .districtId(1)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Tràng Tiền")
                .districtId(1)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Đội Cấn")
                .districtId(2)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Trương Định")
                .districtId(2)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Bạch Mai")
                .districtId(3)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Cầu Giấy")
                .districtId(3)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Trần Phú")
                .districtId(4)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Nguyễn Văn Cừ")
                .districtId(4)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Ngọc Hồi")
                .districtId(5)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Văn Tiến Dũng")
                .districtId(5)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        roadService.save(Road.builder()
                .name("Mỹ Đình")
                .districtId(5)
                .foundingDate(LocalDate.now())
                .status(RoadStatus.USING)
                .build());
        return ResponseEntity.ok(" success");
    }
}