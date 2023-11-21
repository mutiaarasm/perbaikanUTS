/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mutiarasyifamaulida.pkg22090024;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conect {
    public static void main(String[] args) {
        Connection connect = koneksi.getConnection();
        
        if (connect != null) {
            try {
                String query = "SELECT * FROM mhs";
                PreparedStatement statement = connect.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()) {
                    String data = resultSet.getString("email");
                    System.out.println("Percobaan menampilkan eMail: " + data);
                }
                
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Query gagal! Error: " + e.getMessage());
            }
        } else {
            System.out.println("Tidak dapat membuat koneksi.");
        }
    }
}
