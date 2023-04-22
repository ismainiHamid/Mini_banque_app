package ma.banque.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "compteEpargnes")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class CompteEpargne extends Compte {
    @Column(nullable = false)
    private boolean status;

    @Builder
    public CompteEpargne(Integer id, String numeroCompte, double solde, Agence agence, Client client, List<Operation> operations) {
        super(id, numeroCompte, solde, agence, client, operations);
        this.status = false;
    }
}
