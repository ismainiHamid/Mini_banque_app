package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Agence;
import ma.banque.app.services.AgenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Agences")
@RestController
@RequestMapping(value = "/banque/agence")
@AllArgsConstructor
public class AgenceController {
    private AgenceService agenceService;

    @RequestMapping(path = {"/saveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Agence create(@RequestBody Agence agence) {
        return agenceService.create(agence);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Agence agence) {
        return agenceService.delete(agence);
    }

    @GetMapping(value = "/read")
    public List<Agence> findAll() {
        return agenceService.findAll();
    }
}
