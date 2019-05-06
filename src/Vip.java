public class Vip extends Ingresso {

    private float valorAdicional=50F;



    public void ValorVip (){
        valorIngresso = (valorIngresso + valorAdicional);
    }

    public Vip(float valorIngresso, String tipoDeIngresso, String localizacao, float valorAdicional){
        super(valorIngresso, tipoDeIngresso, localizacao);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional(){
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional){
        this.valorAdicional = valorAdicional;
    }
}
