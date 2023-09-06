
package Ogitrov.DAO;

import Ogitrov.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


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

    public void editaFuncionario(Funcionario func) {
        String sql = "UPDATE funcionario SET Nome = '" + func.getNome()+ "', Email = '" + func.getEmail()+ "', Endereco = '" + func.getEndereco()+ "', DataNascimento = '" + func.getDataNascimento()+ "', Salario = '" + func.getSalario()+ "', Senha = '" + func.getSenha()+ "' WHERE Id = '" + func.getId()+ "'";
        ConnectionMVC.executar(sql);
    }

    public void excluirFuncionario(Funcionario func) {
        String sql = "DELETE FROM funcionario WHERE Id = " + func.getId();
        ConnectionMVC.executar(sql);
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        ArrayList<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        ResultSet rs = ConnectionMVC.consultar(sql);
        if(rs != null){
            try{
                while( rs.next() ){
                    int id = rs.getInt("Id");
                    String nome = rs.getString("Nome");
                    String email = rs.getString("Email");
                    String endereco = rs.getString("Endereco");
                    String dataNascimento = rs.getString("DataNascimento");
                    double salario = rs.getDouble("Salario");
                    String senha = rs.getString("Senha");
                    Funcionario func = new Funcionario(id,nome,email,endereco,dataNascimento,salario,senha);
                    lista.add(func);
                }
            }catch(Exception e){
            }
        }
        return lista;
    }
    
   

    
}
