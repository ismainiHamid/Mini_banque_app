package ma.banque.app.iservices;

import ma.banque.app.entities.Agence;

import java.util.List;

public interface IAgence {
    Agence create(Agence agence);

    boolean delete(Agence agence);

    List<Agence> findAll();
}
