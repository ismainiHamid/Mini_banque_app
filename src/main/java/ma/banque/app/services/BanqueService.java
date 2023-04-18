package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IApp.IMetierApp;
import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class BanqueService implements IMetierApp {
    private CompteService compteService;
    private OperationService operationService;
    private ClientService clientService;

    @Override
    public Compte depotByNumeroCompte(Compte compte, double montant) {
        return null;
    }

    @Override
    public Compte depotByCniCompte(Client client, double montant) {
        if (!Objects.isNull(client)) {
            Compte compte = this.clientService.findByCni(client.getCni()).getOperations().stream().map(c -> c.getId().getCompte()).findFirst().orElse(null);
            if (!Objects.isNull(compte)) {
                compte.setSolde(compte.getSolde() + montant);
                return this.compteService.create(compte);
            }
        }
        return null;
    }

    @Override
    public Compte retraitByNumeroCompte(Compte compte, double montant) {
        return null;
    }

    @Override
    public Compte retraitByNCniCompte(Client client, double montant) {
        if (!Objects.isNull(client)) {
            Compte compte = this.clientService.findByCni(client.getCni()).getOperations().stream().map(c -> c.getId().getCompte()).findFirst().orElse(null);
            if (!Objects.isNull(compte)) {
                if (compte.getSolde() <= montant) {
                    compte.setSolde(compte.getSolde() - montant);
                    return this.compteService.create(compte);
                }
            }
        }
        return null;
    }

    @Override
    public boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant) {
        return false;
    }

    @Override
    public boolean viremantBetweenClientByCni(Client clientEnvoie, Client clientRecoit, double montant) {
        return false;
    }
}
