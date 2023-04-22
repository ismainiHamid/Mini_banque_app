package ma.banque.app.iservice;

import ma.banque.app.entity.Agence;
import ma.banque.app.entity.Ville;

import java.util.List;

public interface IVille {
    Ville create(Ville ville);

    Ville Update(Ville ville);

    boolean delete(Ville ville);

    List<Ville> findAll();
}
