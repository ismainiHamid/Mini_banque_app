package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import ma.banque.app.entities.Agence;
import ma.banque.app.services.AgenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/banque/agences")
@AllArgsConstructor
public class AgenceController {
    private AgenceService agenceService;

    @RequestMapping(path = {"/create", "/update"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Agence create(Agence object) {
        return agenceService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Agence object) {
        agenceService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Agence> findAll() {
        return agenceService.findAll();
    }
}
