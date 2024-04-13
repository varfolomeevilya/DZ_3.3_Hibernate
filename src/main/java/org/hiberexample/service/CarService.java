package org.hiberexample.service;

import org.hiberexample.entity.Car;

import java.util.List;

public interface CarService {
    void createTable();
    void dropTable();
    void saveCar(Car car);
    void deleteCarById(Long id);
    List<Car> getAll();
}
