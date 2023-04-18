package ma.banque.app.IApp;

import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;

public interface IMetierApp {
    Compte depotByNumeroCompte(Compte compte, double montant);

    Compte depotByCniCompte(Client client, double montant);

    Compte retraitByNumeroCompte(Compte compte, double montant);

    Compte retraitByNCniCompte(Client client, double montant);

    boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant);

    boolean viremantBetweenClientByCni(Client clientEnvoie, Client clientRecoit, double montant);
}
