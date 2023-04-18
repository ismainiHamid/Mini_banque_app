package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "villes")
@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false, length = 50)
    private String nom;

    @OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Agence> agences;
}
