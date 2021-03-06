package org.eduami.javafaq.springjdbc.jdbctemplate.daodbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCarDao implements CarDao {

	private final DataSource dataSource;

    public JdbcCarDao(DataSource dataSource) {
        this.dataSource=dataSource;
    }



    public void insert(Car car) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
        jdbcTemplate.update(new InsertCarStatementCreator(car));
    }

    public Car findByCarNo(String carNo) {
        String sql = "SELECT * FROM CAR WHERE CAR_NO = ?";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, carNo);

            Car car = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                car = new Car(rs.getString("CAR_NO"),
                        rs.getString("COLOR"), rs.getInt("WHEEL"),
                        rs.getInt("SEAT"));
            }
            rs.close();
            ps.close();
            return car;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }

    public void update(Car car) {
        String sql = "UPDATE CAR SET COLOR=?,WHEEL=?,SEAT=? WHERE CAR_NO=?";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, car.getColor());
            ps.setInt(2, car.getWheel());
            ps.setInt(3, car.getSeat());
            ps.setString(4, car.getCarNo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }

    }

    public void delete(Car car) {
        String sql = "DELETE FROM CAR WHERE CAR_NO=?";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, car.getCarNo());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }

    }
}
