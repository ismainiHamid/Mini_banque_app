package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Client extends Personne {
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Compte> compte;

    @Builder
    public Client(Integer id, String cin, String nom, String prenom, String adresse, String email, String telephone, Date dateNaissance, List<Compte> compte) {
        super(id, cin, nom, prenom, adresse, email, telephone, dateNaissance);
        this.compte = compte;
    }
}
