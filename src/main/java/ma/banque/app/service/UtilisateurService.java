package ma.banque.app.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.entity.Role;
import ma.banque.app.entity.Utilisateur;
import ma.banque.app.iservice.IUtilisateur;
import ma.banque.app.repository.RoleRepository;
import ma.banque.app.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class UtilisateurService implements IUtilisateur {
    private UtilisateurRepository utilisateurRepository;
    private RoleRepository roleRepository;

    @Override
    public Utilisateur create(Utilisateur object) {
        return this.utilisateurRepository.save(object);
    }

    @Override
    public Utilisateur Update(Utilisateur object) {
        return this.utilisateurRepository.save(object);
    }

    @Override
    public boolean delete(Utilisateur object) {
        if (Objects.isNull(object)) return false;
        this.utilisateurRepository.delete(object);
        return true;
    }

    @Override
    public List<Utilisateur> findAll() {
        return this.utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur findByEmail(String email) {
        return this.utilisateurRepository.findByEmail(email);
    }

    @Override
    public Role addNewRole(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String email, String roleNom) {
        utilisateurRepository.findByEmail(email).getRoles().add(roleRepository.findByNom(roleNom));
    }
}
