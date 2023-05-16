package ma.banque.app.iservice;

import ma.banque.app.entity.Role;
import ma.banque.app.entity.Utilisateur;
import ma.banque.app.imetier.IMetier;

public interface IUtilisateur extends IMetier<Utilisateur> {
    Utilisateur findByEmail(String email);

    Role addNewRole(Role role);

    void addRoleToUser(String email, String roleName);
}
