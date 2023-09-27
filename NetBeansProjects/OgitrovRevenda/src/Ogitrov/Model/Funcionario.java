
package Ogitrov.Model;

import Ogitrov.DAO.FuncionarioDAO;
import java.util.ArrayList;
import javax.swing.ButtonGroup;


public class Funcionario {
    
    private int Id;
    private String Nome;
    private String Email;
    private String Endereco;
    private String DataNascimento;
    private double Salario;
    private String Senha;
    private int Cargo;

    

    public Funcionario() {
    }
    
    public Funcionario(String Nome, String Email, String Endereco, String DataNascimento, double Salario, String Senha) {
        this.Nome = Nome;
        this.Email = Email;
        this.Endereco = Endereco;
        this.DataNascimento = DataNascimento;
        this.Salario = Salario;
        this.Senha = Senha;
    }

    public Funcionario(String Email, String Senha) {
        this.Email = Email;
        this.Senha = Senha;
    }

    public Funcionario(int id, String nome, String email, String endereco, String datanascimento, double salario, String senha) {
        this.Id = id;
        this.Nome = nome;
        this.Email = email;
        this.Endereco = endereco;
        this.DataNascimento = datanascimento;
        this.Salario = salario;
        this.Senha = senha;
    }

    public Funcionario(int idFunc) {
        this.Id = idFunc;
    }

    public Funcionario(ButtonGroup CargoBotao) {
    }



    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public int getCargo() {
        return Cargo;
    }

    public void setCargo(int Cargo) {
        this.Cargo = Cargo;
    }
    
    public void cadastrarFuncionario(Funcionario funcionario){
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.cadastrarFuncionario(funcionario);
    }
    public boolean veriFuncionario(String email, String senha){
     //   try{
        FuncionarioDAO fDAO = new FuncionarioDAO();
        
        return fDAO.PesquisarEmail(email,senha);
  //      }catch(Exception e){
     //       return false;
   //     }
    }

    public void EditarFuncionario(Funcionario func) {
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.editaFuncionario(func);
    }

    public void ExcluirFuncionario(Funcionario func) {
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.excluirFuncionario(func);
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        FuncionarioDAO fDAO = new FuncionarioDAO();
        return fDAO.listarFuncionarios();
    }

    public int veriCargo(String email, String senha) {
        FuncionarioDAO fDAO = new FuncionarioDAO();
        
        return fDAO.PesquisarCargo(email,senha); 
    }

    
            
}
