package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IServices.IAgence;
import ma.banque.app.entities.Agence;
import ma.banque.app.repository.AgenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class AgenceService implements IAgence {
    private AgenceRepository agenceRepository;

    @Override
    public Agence create(Agence agence) {
        if (Objects.isNull(agence)) return null;
        return this.agenceRepository.save(agence);
    }

    @Override
    public boolean delete(Agence agence) {
        if (Objects.isNull(agence)) return false;
        this.agenceRepository.delete(agence);
        return true;
    }

    @Override
    public List<Agence> findAll() {
        return this.agenceRepository.findAll();
    }
}
