
package Ogitrov.DAO;

import Ogitrov.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (Nome, Email, Endereco, DataNascimento, Salario, Senha) VALUES ( " + " '" + funcionario.getNome() +  "' , " + " '" + funcionario.getEmail()+  "' , " + " '" + funcionario.getEndereco()+  "' , " + " '" + funcionario.getDataNascimento()+  "' , " + " '" + funcionario.getSalario()+  "' , " + "  " + funcionario.getSenha()  + "  )  ";
        ConnectionMVC.executar(sql);
    }
    
    
    public boolean PesquisarEmail (String email, String senha){
        String sql = "SELECT Email, Senha FROM funcionario WHERE Email = '"  + email+ "' AND Senha = '" + senha + "'";
        
        ResultSet rs = ConnectionMVC.consultar(sql);
        try{
            rs.next();
        String mail = rs.getString("Email");
            
        if(rs != null)
            return true;
        }catch(Exception e)
        {
            
        }
        return false;
    }
    
   

    
}
