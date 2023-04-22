package ma.banque.app.iservice;

import ma.banque.app.entity.Agence;

import java.util.List;

public interface IAgence {
    Agence create(Agence agence);

    boolean delete(Agence agence);

    List<Agence> findAll();
}
