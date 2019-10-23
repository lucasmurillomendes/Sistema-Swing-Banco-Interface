/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.util;

import br.edu.ifpr.dao.VeiculoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class teste {
    public static void main(String[] args) {
        
        try {
            Connection con = ConnectionFactory.createConnectionToMySQL();
            
            VeiculoDAO dao = new VeiculoDAO(con);
            System.out.println(dao.retrieve(4));
            System.out.println(dao.retornaQTD());
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
