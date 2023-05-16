package ma.banque.app.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CompteCourant extends Compte {
    @Builder
    public CompteCourant(Integer id, String numeroCompte, double solde, Agence agence, Client client, List<Operation> operations) {
        super(id, numeroCompte, solde, agence, client, operations);
    }
}
