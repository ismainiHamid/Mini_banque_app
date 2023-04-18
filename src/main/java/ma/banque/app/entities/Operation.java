package ma.banque.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    protected OperationPK id;

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
    public static class OperationPK implements Serializable {
        private String code;

        @ManyToOne
        @JsonIgnore
        private Personne personne;

        @ManyToOne
        @JsonIgnore
        private Compte compte;
    }
}
