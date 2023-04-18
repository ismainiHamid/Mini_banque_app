package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Ville;
import ma.banque.app.services.VilleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Ville")
@RestController
@RequestMapping(value = "/banque/ville")
@AllArgsConstructor
public class VilleController {
    private VilleService villeService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Ville create(@RequestBody Ville object) {
        return villeService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Ville object) {
        villeService.delete(object);
    }

    @GetMapping(value = "/read")
    public List<Ville> findAll() {
        return villeService.findAll();
    }
}