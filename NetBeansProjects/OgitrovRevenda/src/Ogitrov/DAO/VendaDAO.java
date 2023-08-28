/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogitrov.DAO;

import Ogitrov.Model.Venda;

/**
 *
 * @author 182210124
 */
public class VendaDAO {

    public void cadastraVenda(Venda venda) {
        String sql = "INSERT INTO vendas (FK_IdFuncionario, FK_IdCarro, FK_IdMoto, Comissao, FormaPagamento, Valor) VALUES ( " + " '" + venda.getIdFuncionario()+  "' , " + " '" + venda.getIdCarro()+  "' , " + " '" + venda.getIdMoto()+  "' , " + " '" + venda.getComissao()+  "' , " + " '" + venda.getFormaPagamento()+  "' , " + "  " + venda.getValor()+ "  )  ";
        ConnectionMVC.executar(sql);
    }
    
}
