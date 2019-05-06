import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        int opcao;

        Ingresso ingresso1 = new Ingresso();

        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de ingresso\n 1 => Normal \n 2 => VIP\n");
        opcao = input.nextInt();

        if (opcao == 1) {
            ingresso1.setTipoDeIngresso("Normal");
            ingresso1.setValorIngresso(ingresso1.valorIngresso);
            ingresso1.setLocalizacao("Pista");
            System.out.println("Ingresso Normal\nLocalização Pista\nValor R$ " + ingresso1.getValorIngresso());
        } else if (opcao == 2) {
            System.out.println("Ingresso Vip\n1=> Camarote Superior\n2 => Camarote Inferior\nDigite: ");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("Ingresso Camarote Superior");
                ingresso1.setValorIngresso(200F);
                ingresso1.setTipoDeIngresso("Camarote Superior");
                ingresso1.imprimeValor();
            } else {
                System.out.println("Ingresso Camarote Inferior");
                ingresso1.setValorIngresso(150F);
                ingresso1.setTipoDeIngresso("Camarote Superior");
                ingresso1.imprimeValor();
            }

        }




    }
}
