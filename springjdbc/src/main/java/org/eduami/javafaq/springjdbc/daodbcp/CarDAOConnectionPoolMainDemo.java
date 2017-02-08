package org.eduami.javafaq.springjdbc.daodbcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CarDAOConnectionPoolMainDemo {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        CarDao carDao = context.getBean(CarDao.class);
        Car car = new Car("TEM0008", "Red", 4, 4);
        carDao.insert(car);

        car = carDao.findByVehicleNo("TEM0008");
        System.out.println("Car No: " + car.getCarNo());
        System.out.println("Color: " + car.getColor());
        System.out.println("Wheel: " + car.getWheel());
        System.out.println("Seat: " + car.getSeat());
    }

}
