/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.grilocomp.dal;

import java.sql.*;

/**
 *
 * @author 55349
 */
public class ModuloConexao {

    //Método por conectar com o BD
    public static Connection conector() {
        Connection conexao = null;
        // Chama o driver de conexao - Biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando info referente ao BD
        String url = "jdbc:mysql://localhost:3306/dbgrilocomp?characterEncoding=utf-8";
        String user = "dba";
        String password = "Grilo1234";
        // Conectando com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }
}
