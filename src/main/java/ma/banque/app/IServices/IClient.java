package ma.banque.app.IServices;

import ma.banque.app.entities.Client;

import java.util.List;

public interface IClient {
    Client create(Client client);

    boolean delete(Client client);

    List<Client> findAll();

    Client findByCin(String cin);
}
