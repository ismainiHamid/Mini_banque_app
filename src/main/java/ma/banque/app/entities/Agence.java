package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "agences")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false, length = 100)
    private String adresse;

    @OneToMany(mappedBy = "agence", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Compte> comptes;

    @ManyToOne
    @JsonIgnore
    private Ville ville;
}