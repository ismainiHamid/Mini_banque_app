package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IServices.IVille;
import ma.banque.app.entities.Ville;
import ma.banque.app.repository.VilleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class VilleService implements IVille {
    private VilleRepository villeRepository;

    @Override
    public Ville create(Ville ville) {
        if (Objects.isNull(ville)) return null;
        return this.villeRepository.save(ville);
    }

    @Override
    public boolean delete(Ville ville) {
        if (Objects.isNull(ville)) return false;
        this.villeRepository.delete(ville);
        return true;
    }

    @Override
    public List<Ville> findAll() {
        return this.villeRepository.findAll();
    }
}
