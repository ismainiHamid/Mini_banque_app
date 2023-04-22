package ma.banque.app.entities;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class CompteCourant extends Compte {

    @Builder
    public CompteCourant(Integer id, String numeroCompte, double solde, Agence agence, Client client, List<Operation> operations) {
        super(id, numeroCompte, solde, agence, client, operations);
    }
}
