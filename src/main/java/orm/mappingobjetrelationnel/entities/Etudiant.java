package orm.mappingobjetrelationnel.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Etudiant implements Serializable {

    @Id
    private long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "etudiant")
    private Collection<Inscription> Inscritption;

}
