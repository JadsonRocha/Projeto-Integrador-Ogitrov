
package Ogitrov.Model;


public class Proprietario {
    
    private int Id;

    
    private String Nome;
    private String Email;
    private String Endereco;
    private String DataNascimento;
    private String Telefone;

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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public Proprietario(String Nome, String Email, String Endereco, String DataNascimento, String Telefone) {
        this.Nome = Nome;
        this.Email = Email;
        this.Endereco = Endereco;
        this.DataNascimento = DataNascimento;
        this.Telefone = Telefone;
    }
}
