package orm.mappingobjetrelationnel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.mappingobjetrelationnel.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
