package ma.banque.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Operations")
@NoArgsConstructor
@AllArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(nullable = false, length = 10, unique = true)
    protected String code;

    @Column(nullable = false)
    protected double montant;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date date;

    @ManyToOne
    @JsonIgnore
    protected Compte compte;
}
