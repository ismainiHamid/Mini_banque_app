package ma.banque.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

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
    private Integer id;

    @Column(nullable = false, unique = true, length = 10)
    private String cin;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Column(nullable = false, length = 200)
    private String adresse;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 14)
    private String telephone;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @OneToMany(mappedBy = "id.personne", fetch = FetchType.EAGER)
    private List<Operation> operations;
}
