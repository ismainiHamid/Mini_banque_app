package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservices.IClient;
import ma.banque.app.entities.Client;
import ma.banque.app.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class ClientService implements IClient {
    private ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        if (Objects.isNull(client)) return null;
        return this.clientRepository.save(client);
    }

    @Override
    public boolean delete(Client client) {
        if (Objects.isNull(client)) return false;
        this.clientRepository.delete(client);
        return true;
    }

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client findByCin(String cin) {
        return this.clientRepository.findByCin(cin);
    }
}
