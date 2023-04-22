package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservices.IBanque;
import ma.banque.app.entities.*;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class BanqueService implements IBanque {
    private CompteService compteService;
    private OperationService operationService;
    private ClientService clientService;


    @Override
    public boolean depotByNumeroCompte(Compte compteCourant, double montant) {
        return false;
    }

    @Override
    public boolean depotByCinClient(Client client, double montant) {
        return false;
    }

    @Override
    public boolean retraitByNumeroCompte(Compte compteCourant, double montant) {
        return false;
    }

    @Override
    public boolean retraitByCinClient(Client client, double montant) {
        return false;
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
