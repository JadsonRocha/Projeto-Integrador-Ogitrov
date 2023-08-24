
package Ogitrov.Controller;

import Ogitrov.Model.Funcionario;


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
}
