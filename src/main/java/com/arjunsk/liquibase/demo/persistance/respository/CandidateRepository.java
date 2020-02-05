package com.arjunsk.liquibase.demo.persistance.respository;

import com.arjunsk.liquibase.demo.persistance.entities.Candidate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, String> {

  /**
   * Returns a list of candidates who's last name is lastName
   *
   * Note: This function was created for writing Test class for Repository.
   *
   * @param lastName String value
   * @return List of Candidates
   */
  @Query("select candidate from Candidate candidate where candidate.lastName = :lastName")
  List<Candidate> findCandidateWithLastName(@Param("lastName") String lastName);
}
