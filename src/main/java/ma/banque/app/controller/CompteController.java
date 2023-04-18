package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Compte;
import ma.banque.app.services.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Compte")
@RestController
@RequestMapping(value = "/banque/compte")
@AllArgsConstructor
public class CompteController {
    private CompteService compteService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Compte create(@RequestBody Compte object) {
        return compteService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Compte object) {
        compteService.delete(object);
    }

    @GetMapping(value = "/read")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @GetMapping(value = "")
    public Compte findByNumeroCompte(@PathParam(value = "numeroCompte") Long numeroCompte) {
        return compteService.findByNumeroCompte(numeroCompte);
    }
}
