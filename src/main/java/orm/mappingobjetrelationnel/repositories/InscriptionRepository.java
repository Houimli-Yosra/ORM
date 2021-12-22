package orm.mappingobjetrelationnel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.mappingobjetrelationnel.entities.Cours;
import orm.mappingobjetrelationnel.entities.Inscription;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    List<Inscription> findByCours(Cours cours);
}
