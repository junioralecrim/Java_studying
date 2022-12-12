package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionDB conexao = ConnectionDB.getInstance();

        System.out.println(conexao.getConnection());
    }
}