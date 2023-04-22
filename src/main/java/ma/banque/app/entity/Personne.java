package ma.banque.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "personnes")
@NoArgsConstructor
@AllArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(nullable = false, unique = true, length = 10)
    protected String cin;

    @Column(nullable = false, length = 50)
    protected String nom;

    @Column(nullable = false, length = 50)
    protected String prenom;

    @Column(nullable = false, length = 200)
    protected String adresse;

    @Column(nullable = false, length = 100)
    protected String email;

    @Column(nullable = false, length = 14)
    protected String telephone;

    @Temporal(TemporalType.DATE)
    protected Date dateNaissance;
}
