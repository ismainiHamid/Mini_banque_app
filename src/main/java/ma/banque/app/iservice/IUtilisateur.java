package ma.banque.app.iservice;

import ma.banque.app.entity.Utilisateur;
import ma.banque.app.entity.Ville;

import java.util.List;

public interface IUtilisateur {
    Utilisateur create(Utilisateur utilisateur);

    Utilisateur Update(Utilisateur utilisateur);

    boolean delete(Utilisateur utilisateur);

    List<Utilisateur> findAll();
}
