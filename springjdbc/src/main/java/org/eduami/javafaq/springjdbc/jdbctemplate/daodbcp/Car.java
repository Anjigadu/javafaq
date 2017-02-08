package org.eduami.javafaq.springjdbc.jdbctemplate.daodbcp;

public class Car {
    private String carNo;
    private String color;
    private int wheel;
    private int seat;

    public Car() {
    }

    public Car(String carNo, String color, int wheel, int seat) {
        this.carNo = carNo;
        this.color = color;
        this.wheel = wheel;
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public int getSeat() {
        return seat;
    }

    public String getCarNo() {
        return carNo;
    }

    public int getWheel() {
        return wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
