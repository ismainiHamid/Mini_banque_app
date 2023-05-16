package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entity.Role;
import ma.banque.app.entity.Utilisateur;
import ma.banque.app.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Utilisateurs")
@RestController
@RequestMapping(value = "/banque/utilisateurs")
@AllArgsConstructor
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    @PostMapping(value = "/create")
    public Utilisateur create(@RequestBody Utilisateur object) {
        return utilisateurService.create(object);
    }

    @PutMapping(value = "/update")
    public Utilisateur Update(@RequestBody Utilisateur object) {
        return utilisateurService.Update(object);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(Utilisateur object) {
        return utilisateurService.delete(object);
    }

    @GetMapping(value = "/read")
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }

    @PostMapping(value = "/findByEmail")
    public Utilisateur findByEmail(@RequestParam(value = "email") String email) {
        return utilisateurService.findByEmail(email);
    }

    @PostMapping(value = "/addNewRole")
    public Role addNewRole(@RequestBody Role role) {
        return utilisateurService.addNewRole(role);
    }

    @PostMapping(value = "/addRoleToUser")
    public void addRoleToUser(@RequestParam(value = "email") String email, @RequestParam(value = "roleNom") String roleNom) {
        utilisateurService.addRoleToUser(email, roleNom);
    }
}
