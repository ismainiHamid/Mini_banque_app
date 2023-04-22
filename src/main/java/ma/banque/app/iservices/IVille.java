package ma.banque.app.iservices;

import ma.banque.app.entities.Ville;

import java.util.List;

public interface IVille {
    Ville create(Ville ville);

    boolean delete(Ville ville);

    List<Ville> findAll();
}
