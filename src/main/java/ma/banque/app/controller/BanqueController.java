package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Client;
import ma.banque.app.entities.Compte;
import ma.banque.app.services.BanqueService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Banque")
@RestController
@RequestMapping(value = "/banque")
@AllArgsConstructor
public class BanqueController {
    private BanqueService banqueService;

    @PostMapping(value = "/depotByNumeroCompte")
    public Compte depotByNumeroCompte(@RequestBody Compte compte, @PathParam(value = "montant") double montant) {
        return banqueService.depotByNumeroCompte(compte, montant);
    }

    @PostMapping(value = "/depotByCniCompte")
    public Compte depotByCniCompte(@RequestBody Client client, @PathParam(value = "montant") double montant) {
        return banqueService.depotByCniCompte(client, montant);
    }

    @PostMapping(value = "/retraitByNumeroCompte")
    public Compte retraitByNumeroCompte(@RequestBody Compte compte, @PathParam(value = "montant") double montant) {
        return banqueService.retraitByNumeroCompte(compte, montant);
    }

    @PostMapping(value = "/retraitByNCniCompte")
    public Compte retraitByNCniCompte(@RequestBody Client client, @PathParam(value = "montant") double montant) {
        return banqueService.retraitByNCniCompte(client, montant);
    }

    @PostMapping(value = "/viremantBetweenClientByNumeroCompte")
    public boolean viremantBetweenClientByNumeroCompte(@RequestBody Compte compteEnvoie, @RequestBody Compte compteRecoit, @PathParam(value = "montant") double montant) {
        return banqueService.viremantBetweenClientByNumeroCompte(compteEnvoie, compteRecoit, montant);
    }

    @PostMapping(value = "/viremantBetweenClientByCni")
    public boolean viremantBetweenClientByCni(@RequestBody Client clientEnvoie, @RequestBody Client clientRecoit, @PathParam(value = "montant") double montant) {
        return banqueService.viremantBetweenClientByCni(clientEnvoie, clientRecoit, montant);
    }
}
