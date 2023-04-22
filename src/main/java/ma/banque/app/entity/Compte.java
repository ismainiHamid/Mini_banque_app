package ma.banque.app.entity;

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
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(nullable = false, unique = true)
    protected String numeroCompte;

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
