package ma.banque.app.services;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Ville;
import ma.banque.app.repository.VilleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class VilleService implements IMetier<Ville> {
    private VilleRepository villeRepository;

    @Override
    public Ville create(Ville object) {
        if (Objects.isNull(object)) return null;
        return this.villeRepository.save(object);
    }

    @Override
    public void delete(Ville object) {
        this.villeRepository.delete(object);
    }

    @Override
    public List<Ville> findAll() {
        return this.villeRepository.findAll();
    }
}
