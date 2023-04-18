package ma.banque.app.IApp;

import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;

public interface IMetierApp {
    Compte depotByNumeroCompte(Compte compteCourant, double montant);

    Compte depotByCinClient(Client client, double montant);

    Compte retraitByNumeroCompte(Compte compteCourant, double montant);

    Compte retraitByCinClient(Client client, double montant);

    boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant);

    boolean viremantBetweenClientByCin(Client clientEnvoie, Client clientRecoit, double montant);
}
