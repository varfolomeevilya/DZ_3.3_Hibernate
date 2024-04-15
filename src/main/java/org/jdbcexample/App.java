package org.jdbcexample;

import lombok.Builder;
import org.jdbcexample.dao.CarDAO;
import org.jdbcexample.dao.CarDAOJDBCImpl;
import org.jdbcexample.model.Cat;

import java.util.List;

public class App {
    @Builder
    public static void main(String[] args) {
        CarDAO carDao = new CarDAOJDBCImpl();

        carDao.createTable();

        Cat car = Cat.builder()
                .color("RED")
                .model("Nissan")
                .cost(100_000L)
                .build();

        Cat car2 = Cat.builder()
                .color("BLUE")
                .model("Toyota")
                .cost(2_000_000L)
                .build();

        carDao.saveCar(car);
        carDao.saveCar(car2);

        List<Cat> cars = carDao.getAllCars();

        System.out.println("BEFORE REMOVING");
        cars.forEach(System.out::println);
        System.out.println();

        Long idForRemove = cars.stream()
                .map(Cat::getId)
                .findAny()
                .orElseThrow();

//        carDao.removeCarById(idForRemove);
        System.out.println();
        System.out.println("AFTER REMOVING");
        carDao.getAllCars().forEach(System.out::println);

//        carDao.dropTable();
    }
}
