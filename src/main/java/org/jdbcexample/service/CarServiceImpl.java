//package org.jdbcexample.service;
//
//import lombok.RequiredArgsConstructor;
//import org.hiberexample.entity.Car;
//import org.jdbcexample.dao.CarDAO;
//import org.jdbcexample.enums.EngineType;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//@RequiredArgsConstructor
//public class CarServiceImpl implements CarService{
//
//    private final CarDAO carDAO;
//    private boolean flag;
//
//    @Override
//    public void createTable() {
//        carDAO.createTable();
//    }
//
//    @Override
//    public void dropTable() {
//        carDAO.dropTable();
//    }
//
//    @Override
//    public void saveCar(Car car) {
//        carDAO.saveCar(car);
//    }
//
//    @Override
//    public void deleteCarById(Long id) {
//        carDAO.deleteCarById(id);
//    }
//
//    @Override
//    public void updateCar(Car car) {
//        carDAO.updateCar(car);
//    }
//
//    @Override
//    public Car findCarById(Long id) {
//        return carDAO.findCarById(id);
//    }
//
//    @Override
//    public List<Car> getAll() {
//        return carDAO.getAll();
//    }
//
//    private void initializingTable() {
//        Car porsche = Car.builder()
//                .name("Porsche 911 Turbo S, 2023")
//                .power(650)
//                .engineType(EngineType.GASOLINE)
//                .build();
//        Car tesla = Car.builder()
//                .name("Tesla Roadster")
//                .power(1000)
//                .engineType(EngineType.ELECTRIC)
//                .build();
//        Car ram = Car.builder()
//                .name("Ram 1500 Crew Cab")
//                .power(260)
//                .engineType(EngineType.DIESEL)
//                .build();
//        Car lada = Car.builder()
//                .name("Lada Priora")
//                .power(98)
//                .engineType(EngineType.GASOLINE)
//                .build();
//        Car chery = Car.builder()
//                .name("Chery TIGGO 8 PRO")
//                .power(235)
//                .engineType(EngineType.HYBRID)
//                .build();
//        Car nissan = Car.builder()
//                .name("Nissan GT-R")
//                .power(485)
//                .engineType(EngineType.GASOLINE)
//                .build();
//        carDAO.saveCar(porsche);
//        carDAO.saveCar(tesla);
//        carDAO.saveCar(ram);
//        carDAO.saveCar(lada);
//        carDAO.saveCar(chery);
//        carDAO.saveCar(nissan);
//    }
//
//    @Override
//    public void initialize() {
//        if (!flag) {
//            initializingTable();
//            flag = true;
//        }
//    }
//
//    @Override
//    public void printAllEntity() {
//        carDAO.getAll().forEach(System.out::println);
//    }
//
//    @Override
//    public Long countingAllEntitiesInDatabase() {
//        return (long) carDAO.getAll().size();
//    }
//
//    @Override
//    public List<Car> findCarByEngineType(String engineType) {
//        List<Car> cars = new ArrayList<>();
//
//        for (Car car : carDAO.getAll()) {
//            if (car.getEngineType == EngineType.valueOf(engineType)) {
//                cars.add(car);
//            }
//        }
//        return cars;
//    }
//
//    @Override
//    public void addNewCar(String name, Integer power, EngineType engineType) {
//        Car car = Car.builder()
//                .name(name)
//                .power(power)
//                .engineType(engineType)
//                .build();
//        carDAO.saveCar(car);
//    }
//}
