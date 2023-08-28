/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogitrov.DAO;

import Ogitrov.Model.Proprietario;

/**
 *
 * @author 182210124
 */
public class ProprietarioDAO {

    public void cadastrarProprietario(Proprietario propi) {
        String sql = "INSERT INTO proprietario (Nome, Email, Endereco, DataNascimento, Telefone) VALUES ( " + " '" + propi.getNome() +  "' , " + " '" + propi.getEmail()+  "' , " + " '" + propi.getEndereco()+  "' , " + " '" + propi.getDataNascimento()+  "' , " + "  " + propi.getTelefone()+ "  )  ";
        ConnectionMVC.executar(sql);
    }
    
}
