package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.services.BanqueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Banque")
@RestController
@RequestMapping(value = "/banque")
@AllArgsConstructor
public class BanqueController {
    private BanqueService banqueService;

    public boolean depotByNumeroCompte(Long numero, double montant) {
        return banqueService.depotByNumeroCompte(numero, montant);
    }

    public boolean retraitByNumeroCompte(Long numero, double montant) {
        return banqueService.retraitByNumeroCompte(numero, montant);
    }

    public boolean depotByCniCompte(String cni, double montant) {
        return banqueService.depotByCniCompte(cni, montant);
    }

    public boolean retraitByNCniCompte(String cni, double montant) {
        return banqueService.retraitByNCniCompte(cni, montant);
    }

    public boolean viremantBetweenClientByNumeroCompte(Long numero_1, Long numero_2, double montant) {
        return banqueService.viremantBetweenClientByNumeroCompte(numero_1, numero_2, montant);
    }

    public boolean viremantBetweenClientByNumeroCni(String cni_1, String cni_2, double montant) {
        return banqueService.viremantBetweenClientByNumeroCni(cni_1, cni_2, montant);
    }
}
