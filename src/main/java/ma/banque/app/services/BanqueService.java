package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IApp.IMetierApp;
import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class BanqueService implements IMetierApp {
    private CompteService compteService;
    private OperationService operationService;
    private ClientService clientService;

    @Override
    public Compte depotByNumeroCompte(Compte compteCourant, double montant) {
        return null;
    }

    @Override
    public Compte depotByCinClient(Client client, double montant) {
        return null;
    }

    @Override
    public Compte retraitByNumeroCompte(Compte compteCourant, double montant) {
        return null;
    }

    @Override
    public Compte retraitByCinClient(Client client, double montant) {
        return null;
    }

    @Override
    public boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant) {
        return false;
    }

    @Override
    public boolean viremantBetweenClientByCin(Client clientEnvoie, Client clientRecoit, double montant) {
        return false;
    }
}
