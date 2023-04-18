package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
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
    public Compte create(Compte object) {
        return compteService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Compte object) {
        compteService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Compte> findAll() {
        return compteService.findAll();
    }
}
