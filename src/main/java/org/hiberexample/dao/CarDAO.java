package org.hiberexample.dao;

import org.hiberexample.entity.Car;

import java.util.List;

public interface CarDAO {
    void createTable();
    void dropTable();
    void saveCar(Car car);
    void deleteCarById(Long id);
    List<Car>getAll();
}
