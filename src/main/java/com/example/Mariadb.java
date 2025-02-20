package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb {
  public Connection tryConnect() {
    try {
      return connect();
    } catch (SQLException e) {
      System.err.println("Hiba! A csatlakozás sikertelen");
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Connection connect() throws SQLException {
    String user = "root";
    String pass = "";
    String url = "jdbc:mariadb://localhost:3306/utvonalak";
    Connection conn = DriverManager.getConnection(url, user, pass);
    return conn;
  }
}
