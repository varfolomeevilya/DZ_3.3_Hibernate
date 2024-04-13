package org.jdbcexample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cat {

    private Long id;

    private String color;

    private Long cost;

    private String model;
}
