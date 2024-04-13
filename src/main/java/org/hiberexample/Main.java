package org.hiberexample;

import org.hiberexample.dao.CarDAO;
import org.hiberexample.dao.CarDAOHibernateImpl;
import org.hiberexample.enums.CountryCode;
import org.hiberexample.entity.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDAO carDao = new CarDAOHibernateImpl();

        carDao.createTable();

        Car car = Car.builder()
                .name("Boeing 777")
//                .countryCode(CountryCode.US)
                .maxSpeed(777)
                .build();

        carDao.saveCar(car);

        List<Car> cars = carDao.getAll();

        cars.forEach(System.out::println);

        Long idForRemoval = cars.stream().findAny().map(Car::getId).orElseThrow();

//        carDao.deleteCarById(idForRemoval);

//        carDAO.dropTable();
    }
}
