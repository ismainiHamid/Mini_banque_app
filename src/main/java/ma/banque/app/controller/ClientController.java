package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Client;
import ma.banque.app.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Client")
@RestController
@RequestMapping(value = "/banque/client")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Client create(@RequestBody Client object) {
        return clientService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Client object) {
        clientService.delete(object);
    }

    @GetMapping(value = "/read")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping(value = "")
    public Client findByCni(@PathParam(value = "cni") String cni) {
        return clientService.findByCni(cni);
    }
}
