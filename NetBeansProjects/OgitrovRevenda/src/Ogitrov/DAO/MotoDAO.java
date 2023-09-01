
package Ogitrov.DAO;

import Ogitrov.Model.Moto;


public class MotoDAO {

    

    public void CadastrarMotoDAO(Moto mot) {
        String sql = "INSERT INTO moto (FK_IdProprietario, Marca, Modelo, Cor, AnoFabricacao, Chassi, Fipe, ValorAvaliado, IPVA, KmRodados, TipoMoto) VALUES ( " + " '" + mot.getIdProprietario()+  "' , " + " '" + mot.getMarca()+  "' , " + " '" + mot.getModelo()+  "' , " + " '" + mot.getCor()+  "' , " + " '" + mot.getAnoFabricacao()+  "' , " + " '" + mot.getChassi()+  "' , " +" '" + mot.getFipe()+  "' , " +" '" + mot.getValorAvaliado()+  "' , " +" '" + mot.getIPVA()+  "' , " +" '" + mot.getKmRodados()+  "' , " +"  " + mot.getTipoMoto()+ "  )  ";
        ConnectionMVC.executar(sql);
    }

    public void editarMotoDAO(Moto mot) {
        String sql = "UPDATE moto SET FK_IdProprietario = '" + mot.getIdProprietario() + "', Marca = '" + mot.getMarca() + "', Modelo = '" + mot.getModelo() + "', Cor = '" + mot.getCor() + "', AnoFabricacao = '" + mot.getAnoFabricacao() + "', Chassi = '" + mot.getChassi() + "', Fipe = '" + mot.getFipe() + "', ValorAvaliado = '" + mot.getValorAvaliado() + "', IPVA = '" + mot.getIPVA() + "', KmRodados = '" + mot.getKmRodados() + "', TipoMoto = '" + mot.getTipoMoto() + "' WHERE ID = '" + mot.getId() + "'";
        ConnectionMVC.executar(sql);
    }

    public void excluirMotoDAO(Moto mot) {
        String sql = "DELETE FROM moto WHERE Id = " + mot.getId();
        ConnectionMVC.executar(sql);
    }


    
            
    
    
}
