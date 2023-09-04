
package Ogitrov.Model;

import Ogitrov.DAO.MotoDAO;
import java.util.ArrayList;


public class Moto {
    private int Id;

    
    private int IdProprietario;
    private String Marca;
    private String Modelo;
    private String Cor;
    private String AnoFabricacao;
    private String Chassi;
    private double Fipe;
    private double ValorAvaliado;
    private double IPVA ;
    private String KmRodados;
    private String TipoMoto;

    
    public Moto() {
    }
    public Moto(int IdProprietario, String Marca, String Modelo, String Cor, String AnoFabricacao, String Chassi, double Fipe, double ValorAvaliado, double IPVA, String KmRodados, String TipoMoto) {
        this.IdProprietario = IdProprietario;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.AnoFabricacao = AnoFabricacao;
        this.Chassi = Chassi;
        this.Fipe = Fipe;
        this.ValorAvaliado = ValorAvaliado;
        this.IPVA = IPVA;
        this.KmRodados = KmRodados;
        this.TipoMoto = TipoMoto;
    }

    public Moto(int idMoto, int idProp, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo) {
        this.Id = idMoto;
        this.IdProprietario = idProp;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Cor = cor;
        this.AnoFabricacao = ano;
        this.Chassi = chassi;
        this.Fipe = fipe;
        this.ValorAvaliado = valorAvaliado;
        this.IPVA = ipva;
        this.KmRodados = km;
        this.TipoMoto = tipo;
    }

    public Moto(int idMoto) {
        this.Id = idMoto;
    }

    

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdProprietario() {
        return IdProprietario;
    }

    public void setIdProprietario(int IdProprietario) {
        this.IdProprietario = IdProprietario;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(String AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public double getFipe() {
        return Fipe;
    }

    public void setFipe(double Fipe) {
        this.Fipe = Fipe;
    }

    public double getValorAvaliado() {
        return ValorAvaliado;
    }

    public void setValorAvaliado(double ValorAvaliado) {
        this.ValorAvaliado = ValorAvaliado;
    }

    public double getIPVA() {
        return IPVA;
    }

    public void setIPVA(double IPVA) {
        this.IPVA = IPVA;
    }

    public String getKmRodados() {
        return KmRodados;
    }

    public void setKmRodados(String KmRodados) {
        this.KmRodados = KmRodados;
    }

    public String getTipoMoto() {
        return TipoMoto;
    }

    public void setTipoMoto(String TipoMoto) {
        this.TipoMoto = TipoMoto;
    }

    public void cadastrarMoto(Moto mot) {
        MotoDAO mDAO = new MotoDAO();
        mDAO.CadastrarMotoDAO(mot);
    }

    public void editarMoto(Moto mot) {
        MotoDAO mDAO = new MotoDAO();
        mDAO.editarMotoDAO(mot);
    }

    public void excluirMoto(Moto mot) {
        MotoDAO mDAO = new MotoDAO();
        mDAO.excluirMotoDAO(mot);
    }

    public ArrayList<Moto> listarMoto() {
        MotoDAO mDAO = new MotoDAO();
        return mDAO.listarMoto();
    }
    
    
}
