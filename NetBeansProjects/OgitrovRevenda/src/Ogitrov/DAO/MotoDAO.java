
package Ogitrov.DAO;

import Ogitrov.Model.Moto;


public class MotoDAO {

    

    public void CadastrarMotoDAO(Moto mot) {
        String sql = "INSERT INTO moto (FK_IdProprietario, Marca, Modelo, Cor, AnoFabricacao, Chassi, Fipe, ValorAvaliado, IPVA, KmRodados, TipoMoto) VALUES ( " + " '" + mot.getIdProprietario()+  "' , " + " '" + mot.getMarca()+  "' , " + " '" + mot.getModelo()+  "' , " + " '" + mot.getCor()+  "' , " + " '" + mot.getAnoFabricacao()+  "' , " + " '" + mot.getChassi()+  "' , " +" '" + mot.getFipe()+  "' , " +" '" + mot.getValorAvaliado()+  "' , " +" '" + mot.getIPVA()+  "' , " +" '" + mot.getKmRodados()+  "' , " +"  " + mot.getTipoMoto()+ "  )  ";
        ConnectionMVC.executar(sql);
    }


    
            
    
    
}
