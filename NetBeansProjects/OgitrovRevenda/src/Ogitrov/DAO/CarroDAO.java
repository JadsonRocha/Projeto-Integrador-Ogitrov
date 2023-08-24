
package Ogitrov.DAO;
import java.sql.Connection;
import Ogitrov.Model.Carro;


public class CarroDAO {

    public void cadastrarCarro(Carro carro) {
        String sql = "INSERT INTO carro (FK_IdProprietario, Marca, Modelo, Cor, AnoFabricacao, Chassi, Fipe, ValorAvaliado, IPVA, KmRodados, TipoCarro, Combustivel, cambio) VALUES ( " + " '" + carro.getIdProprietario()+  "' , " + " '" + carro.getMarca()+  "' , " + " '" + carro.getModelo()+  "' , " + " '" + carro.getCor()+  "' , " + " '" + carro.getAnoFabricacao()+  "' , " + " '" + carro.getChassi()+  "' , " +" '" + carro.getFipe()+  "' , " +" '" + carro.getValorAvaliado()+  "' , " +" '" + carro.getIPVA()+  "' , " +" '" + carro.getKmRodados()+  "' , " +" '" + carro.getTipoCarro()+  "' , " +" '" + carro.getCombustivel()+  "' , " +"  " + carro.getCambio()+ "  )  ";
        ConnectionMVC.executar(sql);
    }
    
}
