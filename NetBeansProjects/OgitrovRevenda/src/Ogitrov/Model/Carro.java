
package Ogitrov.Model;

import Ogitrov.DAO.CarroDAO;
import java.util.ArrayList;


public class Carro {

       
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
    private String TipoCarro;
    private String Combustivel;
    private String Cambio;

    

    public Carro() {
        
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

    public String getTipoCarro() {
        return TipoCarro;
    }

    public void setTipoCarro(String TipoCarro) {
        this.TipoCarro = TipoCarro;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String Combustivel) {
        this.Combustivel = Combustivel;
    }

    public String getCambio() {
        return Cambio;
    }

    public void setCambio(String Cambio) {
        this.Cambio = Cambio;
    }
    
    public Carro(int idCarro){this.Id = idCarro;}
    
    public Carro(int IdProprietario, String Marca, String Modelo, String Cor, String AnoFabricacao, String Chassi, double Fipe, double ValorAvaliado, double IPVA, String KmRodados, String TipoCarro, String Combustivel, String Cambio) {
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
        this.TipoCarro = TipoCarro;
        this.Combustivel = Combustivel;
        this.Cambio = Cambio;
    }
    
    public Carro(int idCarro, int idPropi, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo, String combustivel, String cambio) {
        this.Id = idCarro;
        this.IdProprietario = idPropi;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Cor = cor;
        this.AnoFabricacao = ano;
        this.Chassi = chassi;
        this.Fipe = fipe;
        this.ValorAvaliado = valorAvaliado;
        this.IPVA = ipva;
        this.KmRodados = km;
        this.TipoCarro = tipo;
        this.Combustivel = combustivel;
        this.Cambio = cambio;
    }

    public void cadastrarCarro(Carro carro) {
        CarroDAO cDAO = new CarroDAO();
        cDAO.cadastrarCarro(carro);
    }

    public void editaCarro(Carro carro) {
        CarroDAO cDAO = new CarroDAO();
        cDAO.editaCarro(carro);
    }

    public void excluirCarro(Carro carro) {
        CarroDAO cDAO = new CarroDAO();
        cDAO.excluirCarro(carro);
    }

    public ArrayList<Carro> listarCarro() {

        CarroDAO cDAO = new CarroDAO();
        return cDAO.listarCarro();
    }
    
   
}
