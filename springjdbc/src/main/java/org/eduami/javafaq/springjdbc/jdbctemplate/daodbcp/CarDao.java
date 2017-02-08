package org.eduami.javafaq.springjdbc.jdbctemplate.daodbcp;

public interface CarDao {
    public void insert(Car vehicle);

    public void update(Car vehicle);

    public void delete(Car vehicle);

    public Car findByCarNo(String vehicleNo);


}
