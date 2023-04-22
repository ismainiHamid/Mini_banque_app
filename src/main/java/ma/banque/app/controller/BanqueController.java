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
@RequestMapping(value = "/banque/apis")
@AllArgsConstructor
public class BanqueController {
    private BanqueService banqueService;

    @PostMapping(value = "/depotByNumeroCompte")
    public boolean depotByNumeroCompte(@RequestBody Compte compteCourant, @PathParam(value = "montant") double montant) {
        return banqueService.depotByNumeroCompte(compteCourant, montant);
    }

    @PostMapping(value = "/depotByCinClient")
    public boolean depotByCinClient(@RequestBody Client client, @PathParam(value = "montant") double montant) {
        return banqueService.depotByCinClient(client, montant);
    }

    @PostMapping(value = "/retraitByNumeroCompte")
    public boolean retraitByNumeroCompte(@RequestBody Compte compteCourant, @PathParam(value = "montant") double montant) {
        return banqueService.retraitByNumeroCompte(compteCourant, montant);
    }

    @PostMapping(value = "/retraitByCinClient")
    public boolean retraitByCinClient(@RequestBody Client client, @PathParam(value = "montant") double montant) {
        return banqueService.retraitByCinClient(client, montant);
    }

    @PostMapping(value = "/viremantBetweenClientByNumeroCompte")
    public boolean viremantBetweenClientByNumeroCompte(@RequestBody Compte compteEnvoie, @RequestBody Compte compteRecoit, @PathParam(value = "montant") double montant) {
        return banqueService.viremantBetweenClientByNumeroCompte(compteEnvoie, compteRecoit, montant);
    }

    @PostMapping(value = "/viremantBetweenClientByCin")
    public boolean viremantBetweenClientByCin(@RequestBody Client clientEnvoie, @RequestBody Client clientRecoit, @PathParam(value = "montant") double montant) {
        return banqueService.viremantBetweenClientByCin(clientEnvoie, clientRecoit, montant);
    }
}
