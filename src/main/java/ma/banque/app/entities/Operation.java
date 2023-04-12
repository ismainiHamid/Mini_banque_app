package ma.banque.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
    @EmbeddedId
    protected PrimaryKey id;

    @Column(nullable = false)
    protected String Nature;

    @Column(nullable = false, unique = true)
    protected Long numero;

    @Column(nullable = false)
    protected double montant;

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter(value = AccessLevel.PUBLIC)
    @Setter(value = AccessLevel.PUBLIC)
    public static class PrimaryKey implements Serializable {
        private String code;
        @ManyToOne
        private Personne personne;
        @ManyToOne
        private Compte compte;
    }
}
