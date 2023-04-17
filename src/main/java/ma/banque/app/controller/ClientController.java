package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import ma.banque.app.entities.Client;
import ma.banque.app.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/banque/clients")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @RequestMapping(path = {"/create", "/update"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Client create(Client object) {
        return clientService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Client object) {
        clientService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Client> findAll() {
        return clientService.findAll();
    }
}
