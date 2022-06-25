package fpt.aptech.assimentspringboot.dto;

import com.sun.istack.NotNull;
import fpt.aptech.assimentspringboot.entity.District;
import fpt.aptech.assimentspringboot.entity.myEnum.RoadStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoadDto {
    private int id;
    @NotNull
    private String name;
    @NotNull
    private LocalDate foundingDate;
    private String description;
    @NotNull
    private RoadStatus status;
    @NotNull
    private int districtId;
    private District district;
}
