/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogitrov.DAO;

import Ogitrov.Model.Venda;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 182210124
 */
public class VendaDAO {

    public void cadastraVenda(Venda venda) {
        String sql = "INSERT INTO vendas (FK_IdFuncionario, FK_IdCarro, FK_IdMoto, Comissao, FormaPagamento, Valor) VALUES ( " + " '" + venda.getIdFuncionario()+  "' , " + " '" + venda.getIdCarro()+  "' , " + " '" + venda.getIdMoto()+  "' , " + " '" + venda.getComissao()+  "' , " + " '" + venda.getFormaPagamento()+  "' , " + "  " + venda.getValor()+ "  )  ";
        ConnectionMVC.executar(sql);
    }

    public ArrayList<Venda> listarVendas() {
        ArrayList<Venda> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendas";
        ResultSet rs = ConnectionMVC.consultar(sql);
        if(rs != null){
            try{
                while( rs.next() ){
                    int id = rs.getInt("Id");
                    int idFunci = rs.getInt("FK_IdFuncionario");
                    int idCarro = rs.getInt("FK_IdCarro");
                    int idMoto = rs.getInt("FK_IdMoto");
                    double comissao = rs.getDouble("Comissao");
                    String formaPagamento = rs.getString("FormaPagamento");
                    double valor = rs.getDouble("Valor");
                    Venda vend = new Venda(id,idFunci,idCarro,idMoto,comissao,formaPagamento,valor);
                    lista.add(vend);
                }
            }catch(Exception e){
            }
        }
        return lista;
    }
    
}
