package ma.banque.app.tools;

import ma.banque.app.entity.Client;
import org.apache.commons.lang3.RandomStringUtils;

public class Halter {
    public static String getOperationCode(){
        return RandomStringUtils.random(6, false, true);
    }

    public static String getCompteNumero(Client client){
        return client.getNom().toUpperCase().charAt(0) + client.getPrenom().toUpperCase().charAt(0) + RandomStringUtils.random(8, false, true);
    }
}
