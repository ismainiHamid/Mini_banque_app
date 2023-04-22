package ma.banque.app.entities;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
public class Virement extends Operation {
    @Builder
    public Virement(Integer id, String code, double montant, Date date, Compte compte) {
        super(id, code, montant, date, compte);
    }
}
