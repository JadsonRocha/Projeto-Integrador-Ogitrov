
package Ogitrov.Model;


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
}
