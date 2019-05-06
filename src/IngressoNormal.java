public class IngressoNormal extends Ingresso {


    public IngressoNormal(float valorIngresso, String tipoDeIngresso, String localizacao){
        super(valorIngresso, tipoDeIngresso, localizacao);
    }

    public void imprimeIngresso() {
        System.out.println("Ingresso Normal");
    }


}
