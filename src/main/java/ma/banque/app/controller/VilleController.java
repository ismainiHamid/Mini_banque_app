package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entity.Ville;
import ma.banque.app.service.VilleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Villes")
@RestController
@RequestMapping(value = "/banque/villes")
@AllArgsConstructor
public class VilleController {
    private VilleService villeService;

    @RequestMapping(path = {"/saveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Ville create(@RequestBody Ville ville) {
        return villeService.create(ville);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Ville ville) {
        return villeService.delete(ville);
    }

    @GetMapping(value = "/read")
    public List<Ville> findAll() {
        return villeService.findAll();
    }
}
