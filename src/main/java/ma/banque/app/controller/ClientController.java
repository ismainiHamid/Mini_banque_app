package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Client;
import ma.banque.app.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clients")
@RestController
@RequestMapping(value = "/banque/clients")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @RequestMapping(path = {"/saveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public ma.banque.app.entities.Client create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Client client) {
        return clientService.delete(client);
    }

    @GetMapping(value = "/read")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping
    public Client findByCin(@PathParam(value = "cin") String cin) {
        return clientService.findByCin(cin);
    }
}
