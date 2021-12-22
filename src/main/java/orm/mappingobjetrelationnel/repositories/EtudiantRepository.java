package orm.mappingobjetrelationnel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.mappingobjetrelationnel.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
