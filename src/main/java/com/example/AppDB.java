package com.example;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.dao.EstadoDAO;

public class AppDB {
    public static void main(String[] args) {
        new AppDB();
    }

    public AppDB(){
        try (var conn = ConnectionManager.getConnection() ){ 
            var estadoDAO = new EstadoDAO(conn);
            estadoDAO.listar();
            estadoDAO.localizar("SC");

            var dao = new DAO(conn);
            dao.listar("abastecimentos");
        } catch (SQLException e) {
                System.err.println("Não foi possivel conectar ao Bando de Dados: " + e.getMessage());
        }
    }
}
