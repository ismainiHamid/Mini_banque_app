package ma.banque.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "comptes")
@NoArgsConstructor
@AllArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Long numeroCompte;

    @Column(nullable = false)
    private double solde;

    @OneToMany(mappedBy = "id.compte", fetch = FetchType.EAGER)
    private List<Operation> operations;

    @ManyToOne
    private Agence agence;
}
