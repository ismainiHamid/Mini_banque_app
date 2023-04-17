package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import ma.banque.app.entities.Ville;
import ma.banque.app.services.VilleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/banque/villes")
@AllArgsConstructor
public class VilleController {
    private VilleService villeService;

    @RequestMapping(path = {"/create", "/update"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Ville create(Ville object) {
        return villeService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Ville object) {
        villeService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Ville> findAll() {
        return villeService.findAll();
    }
}
