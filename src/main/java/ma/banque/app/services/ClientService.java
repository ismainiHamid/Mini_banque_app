package ma.banque.app.services;

import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Client;
import ma.banque.app.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ClientService implements IMetier<Client> {
    private ClientRepository clientRepository;

    @Override
    public Client create(Client object) {
        if (Objects.isNull(object)) return null;
        return this.clientRepository.save(object);
    }

    @Override
    public void delete(Client object) {
        this.clientRepository.delete(object);
    }

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }
}
