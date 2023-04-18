package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(nullable = false, length = 10, unique = true)
    protected String code;

    @Column(nullable = false)
    protected String Nature;

    @Column(nullable = false)
    protected double montant;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date date;

    @ManyToOne
    @JsonIgnore
    protected Compte compte;
}
