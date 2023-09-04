
package Ogitrov.DAO;
import java.sql.Connection;
import Ogitrov.Model.Carro;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CarroDAO {

    public void cadastrarCarro(Carro carro) {
        String sql = "INSERT INTO carro (FK_IdProprietario, Marca, Modelo, Cor, AnoFabricacao, Chassi, Fipe, ValorAvaliado, IPVA, KmRodados, TipoCarro, Combustivel, cambio) VALUES ( " + " '" + carro.getIdProprietario()+  "' , " + " '" + carro.getMarca()+  "' , " + " '" + carro.getModelo()+  "' , " + " '" + carro.getCor()+  "' , " + " '" + carro.getAnoFabricacao()+  "' , " + " '" + carro.getChassi()+  "' , " +" '" + carro.getFipe()+  "' , " +" '" + carro.getValorAvaliado()+  "' , " +" '" + carro.getIPVA()+  "' , " +" '" + carro.getKmRodados()+  "' , " +" '" + carro.getTipoCarro()+  "' , " +" '" + carro.getCombustivel()+  "' , " +"  '" + carro.getCambio()+ "'  )  ";
        ConnectionMVC.executar(sql);
    }

    public void editaCarro(Carro carro) {
        String sql = "UPDATE carro SET FK_IdProprietario = '" + carro.getIdProprietario() + "', Marca = '" + carro.getMarca() + "', Modelo = '" + carro.getModelo() + "', Cor = '" + carro.getCor() + "', AnoFabricacao = '" + carro.getAnoFabricacao() + "', Chassi = '" + carro.getChassi() + "', Fipe = '" + carro.getFipe() + "', ValorAvaliado = '" + carro.getValorAvaliado() + "', IPVA = '" + carro.getIPVA() + "', KmRodados = '" + carro.getKmRodados() + "', TipoCarro = '" + carro.getTipoCarro() + "', Combustivel = '" + carro.getCombustivel() + "', cambio = '" + carro.getCambio() + "' WHERE ID = '" + carro.getId() + "'";
        ConnectionMVC.executar(sql);
    }

    public void excluirCarro(Carro carro) {
        String sql = "DELETE FROM carro WHERE Id = " + carro.getId();
        ConnectionMVC.executar(sql);
    }

    public ArrayList<Carro> listarCarro() {
        ArrayList<Carro> lista = new ArrayList<>();
        String sql = "SELECT * FROM carro";
        ResultSet rs = ConnectionMVC.consultar(sql);
        if(rs != null){
            try{
                while( rs.next() ){
                    int id = rs.getInt("Id");
                    int idProp = rs.getInt("FK_IdProprietario");
                    String marca = rs.getString("Marca");
                    String modelo = rs.getString("Modelo");
                    String cor = rs.getString("Cor");
                    String ano = rs.getString("AnoFabricacao");
                    String chassi = rs.getString("Chassi");
                    double fipe = rs.getDouble("Fipe");
                    double valorAvaliado = rs.getDouble("ValorAvaliado");
                    double ipva = rs.getDouble("IPVA");
                    String km = rs.getString("KmRodados");
                    String tipo = rs.getString("TipoCarro");
                    String combustivel = rs.getString("Combustivel");
                    String cambio = rs.getString("cambio");
                    Carro car = new Carro(id,idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo,combustivel,cambio);
                    lista.add(car);
                }
            }catch(Exception e){
            }
        }
        return lista;
    }
    
}
