package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Compte;
import ma.banque.app.repository.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class CompteService implements IMetier<Compte> {
    private CompteRepository compteRepository;

    @Override
    public Compte create(Compte object) {
        if (Objects.isNull(object)) return null;
        return this.compteRepository.save(object);
    }

    @Override
    public void delete(Compte object) {
        this.compteRepository.delete(object);
    }

    @Override
    public List<Compte> findAll() {
        return this.compteRepository.findAll();
    }
}
