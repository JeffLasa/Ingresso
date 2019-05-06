public class CamaroteSuperior extends Vip {


    public CamaroteSuperior(float valorIngresso, String tipoDeIngresso, String localizacao, float valorAdicional){
        super(valorIngresso, tipoDeIngresso, localizacao, valorAdicional);
    }

    public void imprimirLocalizacao(String localizacao){
        System.out.println("Localização Camarote Superior");
    }
}