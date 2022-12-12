package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDB {

    private static ConnectionDB instance;
    private Connection connection;

    ConnectionDB() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", ""); //conectando ao banco de dados com URL, user e senha
            //ResultSet rsCliente = cx.createStatement().executeQuery("SELECT * FROM DATABASE");
        } catch (ClassNotFoundException e){
            System.out.println("Driver jdbc não encontrado");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public static ConnectionDB getInstance() throws SQLException{
        if (instance == null){
            instance = new ConnectionDB();
            System.out.println("Instância realizada com sucesso");
        } else {
            System.out.println("Já existe instância");
        }

        return instance;
    }
}
