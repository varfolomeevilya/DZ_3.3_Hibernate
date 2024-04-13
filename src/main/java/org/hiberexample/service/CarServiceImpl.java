package org.hiberexample.service;

import lombok.RequiredArgsConstructor;
import org.hiberexample.dao.CarDAO;
import org.hiberexample.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{
    private final CarDAO carDAO;
    @Override
    public void createTable() {
      carDAO.createTable();
    }

    @Override
    public void dropTable() {
    carDAO.dropTable();
    }

    @Override
    public void saveCar(Car car) {
     carDAO.saveCar(car);
    }

    @Override
    public void deleteCarById(Long id) {
     carDAO.deleteCarById(id);
    }

    @Override
    public List<Car> getAll() {
        return carDAO.getAll();
    }
}
