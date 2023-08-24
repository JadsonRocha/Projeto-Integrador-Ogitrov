
package Ogitrov.Controller;

import Ogitrov.Model.Carro;


public class CarroController {

    public boolean cadastraCarro(int idProp, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo, String combustivel, String cambio) {
        Carro carro = new Carro(idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo,combustivel,cambio);
        carro.cadastrarCarro(carro);
        return true;
    }
}
