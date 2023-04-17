package ma.banque.app.services;

import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Agence;
import ma.banque.app.repository.AgenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class AgenceService implements IMetier<Agence> {
    private AgenceRepository agenceRepository;

    @Override
    public Agence create(Agence object) {
        if (Objects.isNull(object)) return null;
        return this.agenceRepository.save(object);
    }

    @Override
    public void delete(Agence object) {
        this.agenceRepository.delete(object);
    }

    @Override
    public List<Agence> findAll() {
        return this.agenceRepository.findAll();
    }
}
