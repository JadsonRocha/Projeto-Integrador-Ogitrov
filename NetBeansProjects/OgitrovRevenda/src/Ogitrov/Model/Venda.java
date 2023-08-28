
package Ogitrov.Model;

import Ogitrov.DAO.VendaDAO;


public class Venda {
    
    private int Id;
    private int IdFuncionario;
    private int IdCarro;
    private int IdMoto;
    private double Comissao;
    private String FormaPagamento;

    public Venda(int IdFuncionario, int IdCarro, int IdMoto, double Comissao, String FormaPagamento, double Valor) {
        this.IdFuncionario = IdFuncionario;
        this.IdCarro = IdCarro;
        this.IdMoto = IdMoto;
        this.Comissao = Comissao;
        this.FormaPagamento = FormaPagamento;
        this.Valor = Valor;
    }
    private double Valor;

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public int getIdCarro() {
        return IdCarro;
    }
//
    public void setIdCarro(int IdCarro) {
        this.IdCarro = IdCarro;
    }

    public int getIdMoto() {
        return IdMoto;
    }

    public void setIdMoto(int IdMoto) {
        this.IdMoto = IdMoto;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void cadastrarVenda(Venda venda) {
        VendaDAO vDAO = new VendaDAO();
        vDAO.cadastraVenda(venda);
    }
   
}
