package ma.banque.app.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservice.IUtilisateur;
import ma.banque.app.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class UtilisateurService implements IUtilisateur {
    private UtilisateurRepository utilisateurRepository;
}
