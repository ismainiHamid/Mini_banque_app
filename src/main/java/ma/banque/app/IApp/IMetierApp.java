package ma.banque.app.IApp;

import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;

public interface IMetierApp {
    public boolean depotByNumeroCompte(Long numero, double montant);

    public boolean retraitByNumeroCompte(Long numero, double montant);

    public boolean depotByCniCompte(String cni, double montant);

    public boolean retraitByNCniCompte(String cni, double montant);

    public boolean viremantBetweenClientByNumeroCompte(Long numero_1, Long numero_2, double montant);

    public boolean viremantBetweenClientByNumeroCni(String cni_1, String cni_2, double montant);
}
