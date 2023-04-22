package ma.banque.app.iservice;

import ma.banque.app.entity.Compte;

import java.util.List;

public interface ICompte {
    Compte create(Compte compte);

    boolean delete(Compte compte);

    List<Compte> findAll();

    Compte findByNumeroCompte(String numeroCompte);
}
