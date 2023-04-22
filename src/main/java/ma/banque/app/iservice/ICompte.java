package ma.banque.app.iservice;

import ma.banque.app.entity.Compte;
import ma.banque.app.imetier.IMetier;

public interface ICompte extends IMetier<Compte> {
    Compte findByNumeroCompte(String numeroCompte);
}
