package ma.banque.app.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.entity.Utilisateur;
import ma.banque.app.iservice.IUtilisateur;
import ma.banque.app.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UtilisateurService implements IUtilisateur {
    private UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur create(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public Utilisateur Update(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public boolean delete(Utilisateur utilisateur) {
        return false;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }
}
