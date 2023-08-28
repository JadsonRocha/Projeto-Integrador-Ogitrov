/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogitrov.Controller;

import Ogitrov.Model.Proprietario;

/**
 *
 * @author 182210124
 */
public class ProprietarioController {

    public boolean cadastraFuncionario(String nome, String email, String endereco, String dataNascimento, String telefone) {
        
            Proprietario propi = new Proprietario(nome,email,endereco,dataNascimento,telefone);
            propi.cadastrarPropi(propi);
            return true;
        
      
    }
    
}
