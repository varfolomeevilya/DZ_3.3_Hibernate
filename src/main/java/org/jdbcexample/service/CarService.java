package org.jdbcexample.service;

import org.jdbcexample.model.Cat;

import java.util.List;

public interface CarService {
    void createTable();

    void dropTable();

    void saveCar(Cat car);

    void removeCarById(Long id);

    List<Cat> getAllCars();
}
