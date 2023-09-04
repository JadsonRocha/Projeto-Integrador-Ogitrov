
package Ogitrov.DAO;

import Ogitrov.Model.Moto;
import java.sql.ResultSet;
import java.util.ArrayList;


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

    public ArrayList<Moto> listarMoto() {
        ArrayList<Moto> lista = new ArrayList<>();
        String sql = "SELECT * FROM moto";
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
                    String tipo = rs.getString("TipoMoto");
                    Moto mot = new Moto(id,idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo);
                    lista.add(mot);
                }
            }catch(Exception e){
            }
        }
        return lista;
    }


    
            
    
    
}
