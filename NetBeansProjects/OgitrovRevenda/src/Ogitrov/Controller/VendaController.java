
package Ogitrov.Controller;

import Ogitrov.Model.Venda;


public class VendaController {

    public boolean cadastraVenda(int IdF, int IdCarro, int IdMoto, double Comissao, String forma, double Valor) {
        Venda venda = new Venda(IdF,IdCarro,IdMoto,Comissao,forma,Valor);
        venda.cadastrarVenda(venda);
        return true;
    }

    
    
}
