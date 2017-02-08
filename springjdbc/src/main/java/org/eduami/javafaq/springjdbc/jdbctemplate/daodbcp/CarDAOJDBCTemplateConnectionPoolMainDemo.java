package org.eduami.javafaq.springjdbc.jdbctemplate.daodbcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CarDAOJDBCTemplateConnectionPoolMainDemo {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        CarDao carDao = context.getBean(CarDao.class);
        Car car = new Car("TEM0010", "Red", 4, 4);
        carDao.insert(car);

        car = carDao.findByCarNo("TEM0010");
        System.out.println("Car No: " + car.getCarNo());
        System.out.println("Color: " + car.getColor());
        System.out.println("Wheel: " + car.getWheel());
        System.out.println("Seat: " + car.getSeat());
    }

}
