import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stubWS=new BanqueWS().getBanqueServicePort();
        System.out.println("conversion euro to dh "+stubWS.conversionEuroToDH(800));
        //consulter le compte
        Compte cp=stubWS.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        //consulter la liste des comptes
        List<Compte> cptes=stubWS.listComptes();
        cptes.forEach(c-> {
                System.out.println("------------");
                System.out.println(c.getCode());
                System.out.println(c.getSolde());


        });
        }
}
