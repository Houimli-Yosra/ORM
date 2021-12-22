package orm.mappingobjetrelationnel.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscription implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double score;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Cours cours;
}
