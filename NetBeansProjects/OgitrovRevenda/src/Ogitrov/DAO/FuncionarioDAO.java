
package Ogitrov.DAO;

import Ogitrov.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (Nome, Email, Endereco, DataNascimento, Salario, Senha, ADM) VALUES ( " + " '" + funcionario.getNome() +  "' , " + " '" + funcionario.getEmail()+  "' , " + " '" + funcionario.getEndereco()+  "' , " + " '" + funcionario.getDataNascimento()+  "' , " + " '" + funcionario.getSalario()+  "' , " + " '" + funcionario.getSenha()+  "' , " + "  " + funcionario.getCargo()+ "  )  ";
        ConnectionMVC.executar(sql);
    }
    
    public int VeriCargo(){
        return 1;
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
        String sql = "UPDATE funcionario SET Nome = '" + func.getNome()+ "', Email = '" + func.getEmail()+ "', Endereco = '" + func.getEndereco()+ "', DataNascimento = '" + func.getDataNascimento()+ "', Salario = '" + func.getSalario()+ "', Senha = '" + func.getSenha()+ "', ADM = '" + func.getCargo()+ "' WHERE Id = '" + func.getId()+ "'";
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
                    int cargo = rs.getInt("ADM");
                    Funcionario func = new Funcionario(id,nome,email,endereco,dataNascimento,salario,senha,cargo);
                    lista.add(func);
                }
            }catch(Exception e){
            }
        }
        return lista;
    }

    public int PesquisarCargo(String email, String senha) {
        String sql = "SELECT ADM FROM funcionario WHERE Email = '"  + email+ "' AND Senha = '" + senha + "'";
        
        ResultSet rs = ConnectionMVC.consultar(sql);
        int id=0;
        try{
            rs.next();
            String Id = rs.getString("ADM");
            
            id = Integer.parseInt(Id);
        
        }catch(Exception e)
        {
            
        }
        
        return id;
    }
    
   

    
}
