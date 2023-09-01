
package Ogitrov.Controller;

import Ogitrov.Model.Carro;
import java.util.ArrayList;


public class CarroController {

    public boolean cadastraCarro(int idProp, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo, String combustivel, String cambio) {
        Carro carro = new Carro(idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo,combustivel,cambio);
        carro.cadastrarCarro(carro);
        return true;
    }

    public boolean editaCarro(int idCarro, int idProp, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo, String combustivel, String cambio) {
        Carro carro = new Carro(idCarro,idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo,combustivel,cambio);
        carro.editaCarro(carro);
        return true;
    }

    public boolean excluirCarro(int idCarro) {
        Carro carro = new Carro(idCarro);
        carro.excluirCarro(carro);
        return true;
    }

    public ArrayList<Carro> listarCarros() {
        Carro carro = new Carro();
        return carro.listarCarro();
        
    }
}
