package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    protected Integer id;

    @Column(nullable = false)
    protected Long numeroCompte;

    @Column(nullable = false)
    protected double solde;

    @ManyToOne
    @JsonIgnore
    protected Agence agence;

    @ManyToOne
    @JsonIgnore
    protected Client client;

    @OneToMany(mappedBy = "compte", fetch = FetchType.EAGER)
    @JsonIgnore
    protected List<Operation> operations;
}
