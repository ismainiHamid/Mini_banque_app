package ma.banque.app.IApp;

import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;

public interface IMetierApp {
    public Compte depotByNumeroCompte(Compte compte, double montant);

    public Compte depotByCniCompte(Client client, double montant);

    public Compte retraitByNumeroCompte(Compte compte, double montant);

    public Compte retraitByNCniCompte(Client client, double montant);

    public boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant);

    public boolean viremantBetweenClientByCni(Client clientEnvoie, Client clientRecoit, double montant);
}
