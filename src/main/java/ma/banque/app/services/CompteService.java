package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservices.ICompte;
import ma.banque.app.entities.Compte;
import ma.banque.app.entities.Creation;
import ma.banque.app.repository.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class CompteService implements ICompte {
    private CompteRepository compteRepository;
    private OperationService operationService;

    @Override
    public Compte create(Compte compte) {
        if (Objects.isNull(compte)) return null;
        this.operationService.create(Creation.builder()
                .code("")
                .montant(0)
                .date(new Date())
                .compte(compte)
                .build()
        );
        return this.compteRepository.save(compte);
    }

    @Override
    public boolean delete(Compte compte) {
        if (Objects.isNull(compte)) return false;
        this.compteRepository.delete(compte);
        return true;
    }

    @Override
    public List<Compte> findAll() {
        return this.compteRepository.findAll();
    }

    @Override
    public Compte findByNumeroCompte(String numeroCompte) {
        return this.compteRepository.findByNumeroCompte(numeroCompte);
    }
}
