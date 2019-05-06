public class Ingresso {

    public float valorIngresso=100F;
    private String tipoDeIngresso;
    private String localizacao;

    public Ingresso(){

    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso R$ " + valorIngresso);
    }

    public Ingresso(float valorIngresso, String tipoDeIngresso, String localizacao){
        this.valorIngresso = valorIngresso;
        this.tipoDeIngresso = tipoDeIngresso;
        this.localizacao = localizacao;
    }

    public float getValorIngresso(){
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso){
        this.valorIngresso = valorIngresso;
    }

    public String getTipoDeIngresso(){
        return tipoDeIngresso;
    }

    public void setTipoDeIngresso(String tipoDeIngresso){
        this.tipoDeIngresso = tipoDeIngresso;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public void setValorIngresso(){

    }
}