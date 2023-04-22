package ma.banque.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
public class Employee extends Personne {
    @Column(nullable = false, length = 10)
    private String matricule;

    @Builder
    public Employee(Integer id, String cin, String nom, String prenom, String adresse, String email, String telephone, Date dateNaissance, String matricule) {
        super(id, cin, nom, prenom, adresse, email, telephone, dateNaissance);
        this.matricule = matricule;
    }
}
