package org.eduami.javafaq.springjdbc.jdbctemplate.daodbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

/**
 * Created by marten on 24-03-14.
 */
public class InsertCarStatementCreator implements PreparedStatementCreator {
    private Car car;

    public InsertCarStatementCreator(Car car) {
        this.car = car;
    }

    //@Override -- i am not sure why this is override is causing problem
    public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
        String sql = "INSERT INTO CAR (CAR_NO, COLOR, WHEEL, SEAT) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, car.getCarNo());
        ps.setString(2, car.getColor());
        ps.setInt(3, car.getWheel());
        ps.setInt(4, car.getSeat());
        return ps;
    }

}
