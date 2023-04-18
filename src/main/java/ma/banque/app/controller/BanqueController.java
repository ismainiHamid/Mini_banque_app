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

    public Compte depotByNumeroCompte(Compte compteCourant, double montant) {
        return banqueService.depotByNumeroCompte(compteCourant, montant);
    }

    public Compte depotByCinClient(Client client, double montant) {
        return banqueService.depotByCinClient(client, montant);
    }

    public Compte retraitByNumeroCompte(Compte compteCourant, double montant) {
        return banqueService.retraitByNumeroCompte(compteCourant, montant);
    }

    public Compte retraitByCinClient(Client client, double montant) {
        return banqueService.retraitByCinClient(client, montant);
    }

    public boolean viremantBetweenClientByNumeroCompte(Compte compteEnvoie, Compte compteRecoit, double montant) {
        return banqueService.viremantBetweenClientByNumeroCompte(compteEnvoie, compteRecoit, montant);
    }

    public boolean viremantBetweenClientByCin(Client clientEnvoie, Client clientRecoit, double montant) {
        return banqueService.viremantBetweenClientByCin(clientEnvoie, clientRecoit, montant);
    }
}
