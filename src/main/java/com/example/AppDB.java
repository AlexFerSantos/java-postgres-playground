package com.example;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.dao.ConnectionManager;

public class AppDB {
    public static void main(String[] args) {
        new AppDB();
    }

    public AppDB(){
        try (var conn = ConnectionManager.getConnection() ){ 
            listarEstados(conn);
            localizarEstado(conn, "PR");
            listarDadosTabela(conn, "abastecimentos");
        } catch (SQLException e) {
                System.err.println("Não foi possivel conectar ao Bando de Dados: " + e.getMessage());
        }
    }

    private void listarDadosTabela(Connection conn, String tabela) {
        var sql = "select * from " + tabela;
        try{
            var statement = conn.createStatement();
            var result = statement.executeQuery((sql));

            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-25s | ", metadata.getColumnName(i));
                }
                System.out.println();

            while (result.next()){    
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-25s | ", result.getString(i));
                }
                System.out.println();
            }

        }catch (SQLException e){
            System.out.println("Erro na execução da consulta");
        }
    }

    private void localizarEstado(Connection conn, String uf) {
        try {
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            statement.executeQuery();
        } catch (SQLException e) {
            System.err.println("Não foi possivel realizar a consulta SQL: " + e.getMessage());
        }
    }

    private void listarEstados(Connection conn) {
        try{            
            System.out.println("Conexão com o banco realizada com sucesso!");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while (result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("Não foi possivel realizar a consulta SQL: " + e.getMessage());
        }
    }   
}
