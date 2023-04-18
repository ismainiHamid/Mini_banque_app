package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Agence;
import ma.banque.app.services.AgenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Agence")
@RestController
@RequestMapping(value = "/banque/agence")
@AllArgsConstructor
public class AgenceController {
    private AgenceService agenceService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Agence create(@RequestBody Agence object) {
        return agenceService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Agence object) {
        agenceService.delete(object);
    }

    @GetMapping(value = "/read")
    public List<Agence> findAll() {
        return agenceService.findAll();
    }
}
