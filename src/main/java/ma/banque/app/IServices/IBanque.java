package ma.banque.app.IServices;

import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;

public interface IBanque {
    boolean depotByNumeroCompte(Compte compteCourant, double montant);

    boolean depotByCinClient(Client client, double montant);

    boolean retraitByNumeroCompte(Compte compteCourant, double montant);

    boolean retraitByCinClient(Client client, double montant);

    boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant);

    boolean viremantBetweenClientByCin(Client clientEnvoie, Client clientRecoit, double montant);
}
