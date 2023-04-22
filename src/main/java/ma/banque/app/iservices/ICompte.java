package ma.banque.app.iservices;

import ma.banque.app.entities.Compte;

import java.util.List;

public interface ICompte {
    Compte create(Compte compte);

    boolean delete(Compte compte);

    List<Compte> findAll();

    Compte findByNumeroCompte(String numeroCompte);
}
