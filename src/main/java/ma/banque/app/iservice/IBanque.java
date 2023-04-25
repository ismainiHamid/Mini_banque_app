package ma.banque.app.iservice;

import ma.banque.app.entity.Agence;
import ma.banque.app.entity.Client;
import ma.banque.app.entity.Compte;
import ma.banque.app.entity.Operation;

import java.util.List;

public interface IBanque {
    Compte createCompte(Client client, Agence agence);

    List<Operation> getOperationsByClient(Client client);

    double getSoldeByCompte(String numeroCompte);

    boolean depotByNumeroCompte(Compte compteCourant, double montant);

    boolean depotByCinClient(Client client, double montant);

    boolean retraitByNumeroCompte(Compte compteCourant, double montant);

    boolean retraitByCinClient(Client client, double montant);

    boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant);

    boolean viremantBetweenClientByCin(Client clientEnvoie, Client clientRecoit, double montant);
}
