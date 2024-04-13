package org.hiberexample.entity;

import lombok.*;
import org.hiberexample.enums.CountryCode;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "max_speed")
    private Integer maxSpeed;
//    @Column(name = "country_code")
//    @Enumerated(EnumType.STRING)
//    private CountryCode countryCode;

}
