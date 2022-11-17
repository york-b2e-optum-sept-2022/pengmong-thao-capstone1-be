package net.yorksolutions.pengmongthaocapstone1be.repositories;

import net.yorksolutions.pengmongthaocapstone1be.models.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long> {
}
