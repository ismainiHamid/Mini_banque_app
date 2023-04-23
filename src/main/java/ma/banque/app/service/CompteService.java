package ma.banque.app.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservice.ICompte;
import ma.banque.app.entity.Compte;
import ma.banque.app.repository.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class CompteService implements ICompte {
    private CompteRepository compteRepository;

    @Override
    public Compte create(Compte object) {
        if (Objects.isNull(object)) return null;
        return this.compteRepository.save(object);
    }

    @Override
    public Compte Update(Compte object) {
        if (Objects.isNull(object)) return null;
        return this.compteRepository.save(object);
    }

    @Override
    public boolean delete(Compte object) {
        if (Objects.isNull(object)) return false;
        this.compteRepository.delete(object);
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
