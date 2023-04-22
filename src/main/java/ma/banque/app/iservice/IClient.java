package ma.banque.app.iservice;

import ma.banque.app.entity.Agence;
import ma.banque.app.entity.Client;

import java.util.List;

public interface IClient {
    Client create(Client client);

    Client Update(Client client);

    boolean delete(Client client);

    List<Client> findAll();

    Client findByCin(String cin);
}
