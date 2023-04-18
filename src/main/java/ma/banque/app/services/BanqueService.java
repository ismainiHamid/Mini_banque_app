package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IApp.IMetierApp;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class BanqueService implements IMetierApp {
    private CompteService compteService;
    private OperationService operationService;
    private ClientService clientService;

    @Override
    public boolean depotByNumeroCompte(Long numero, double montant) {
        return false;
    }

    @Override
    public boolean retraitByNumeroCompte(Long numero, double montant) {
        return false;
    }

    @Override
    public boolean depotByCniCompte(String cni, double montant) {
        return false;
    }

    @Override
    public boolean retraitByNCniCompte(String cni, double montant) {
        return false;
    }

    @Override
    public boolean viremantBetweenClientByNumeroCompte(Long numero_1, Long numero_2, double montant) {
        return false;
    }

    @Override
    public boolean viremantBetweenClientByNumeroCni(String cni_1, String cni_2, double montant) {
        return false;
    }
}
