package ma.banque.app.IServices;

import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Compte;
import ma.banque.app.entities.CompteCourant;

public interface ICompteService extends IMetier<Compte> {
    Compte findByNumeroCompte(Long numeroCompte);
}
