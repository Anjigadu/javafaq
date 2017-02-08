package org.eduami.javafaq.springjdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CarDAOJdbcMainDemo {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        CarDao carDao = context.getBean(CarDao.class);
        Car car = new Car("TEM0007", "Yellow", 4, 4);
        carDao.insert(car);

        car = carDao.findByVehicleNo("TEM0007");
        System.out.println("Car No: " + car.getCarNo());
        System.out.println("Color: " + car.getColor());
        System.out.println("Wheel: " + car.getWheel());
        System.out.println("Seat: " + car.getSeat());
    }

}
