package fpt.aptech.assimentspringboot.entity;

import com.sun.istack.NotNull;
import fpt.aptech.assimentspringboot.entity.myEnum.RoadStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roads")
@ToString
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
