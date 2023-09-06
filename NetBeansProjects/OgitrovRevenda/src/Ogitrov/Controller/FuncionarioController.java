
package Ogitrov.Controller;

import Ogitrov.Model.Funcionario;
import java.util.ArrayList;


public class FuncionarioController {
     boolean f;
    public boolean cadastraFuncionario(String nome, String email, String endereco, String datanascimento, double salario, String senha){
        if(nome != null && email != null && endereco != null && datanascimento != null && salario != 0 && senha != null){
            Funcionario func = new Funcionario(nome,email,endereco,datanascimento,salario,senha);
            func.cadastrarFuncionario(func);
            return true;
        }
        return false;
    }
    
    public boolean VeriFuncionario(String email, String senha){
       
        if(email != null && senha != null){
            Funcionario func = new Funcionario(email,senha);
            return func.veriFuncionario(email,senha);
        }
        return false;
    }

    public boolean editaFuncionario(int id, String nome, String email, String endereco, String datanascimento, double salario, String senha) {
        Funcionario func = new Funcionario(id,nome,email,endereco,datanascimento,salario,senha);
        func.EditarFuncionario(func);
        return true;
    }

    public boolean excluirFuncionario(int idFunc) {
        Funcionario func = new Funcionario(idFunc);
        func.ExcluirFuncionario(func);
        return true;
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        Funcionario func = new Funcionario();
        return func.listarFuncionarios();
    }
}
