package org.jdbcexample.service;

import org.jdbcexample.dao.CarDAO;
import org.jdbcexample.dao.CarDAOJDBCImpl;
import org.jdbcexample.model.Cat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO = new CarDAOJDBCImpl();
    public void createTable(){
       carDAO.createTable();
    }
    public void dropTable(){
      carDAO.dropTable();
    }

    public void saveCar(Cat car){
        carDAO.saveCar(car);
    }

    public void removeCarById(Long id){
        carDAO.removeCarById(id);
    }

    public List<Cat> getAllCars(){
        return carDAO.getAllCars();
    }
}
