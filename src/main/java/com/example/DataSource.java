package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {

  public static void tryCreateUtvonal(Utvonal utvonal) {
    try {
      createUtvonal(utvonal);
    } catch (SQLException e) {
      System.err.println("Hiba! Új adatok felvétele sikertelen!");
      System.err.println(e.getMessage());
    }
  }

  private static void createUtvonal(Utvonal utvonal) throws SQLException {
    Mariadb mairadb = new Mariadb();
    Connection conn = mairadb.connect();

    String sql = "INSERT INTO Utvonalak (length, difficulty, start, destination) VALUES (?, ?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    
    ps.setDouble(1, utvonal.length);
    ps.setInt(2, utvonal.difficulty);
    ps.setString(3, utvonal.start);
    ps.setString(4, utvonal.destination);
    ps.execute();
    ps.close();
    conn.close();
  }
}
