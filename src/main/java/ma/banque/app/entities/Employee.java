package ma.banque.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Employee extends Personne {
    @Column(nullable = false, length = 10)
    private String matricule;
}
