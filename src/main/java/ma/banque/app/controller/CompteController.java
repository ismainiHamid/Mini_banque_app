package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Compte;
import ma.banque.app.services.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Comptes")
@RestController
@RequestMapping(value = "/banque/comptes")
@AllArgsConstructor
public class CompteController {
    private CompteService compteService;

    @RequestMapping(path = {"/saveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Compte create(@RequestBody Compte compte) {
        return compteService.create(compte);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Compte compte) {
        return compteService.delete(compte);
    }

    @GetMapping(value = "/read")
    public List<Compte> findAll() {
        return compteService.findAll();
    }

    @GetMapping
    public Compte findByNumeroCompte(@PathParam(value = "numeroCompte") String numeroCompte) {
        return compteService.findByNumeroCompte(numeroCompte);
    }
}
