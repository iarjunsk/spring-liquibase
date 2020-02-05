package com.arjunsk.liquibase.demo.persistance.respository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.arjunsk.liquibase.demo.persistance.entities.Candidate;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class CandidateRepositoryTest {

  @Autowired private CandidateRepository candidateRepository;

  @Before
  public void setUp() throws Exception {

    Candidate candidate1 =
        Candidate.builder()
            .id("id1")
            .firstName("Arjun")
            .middleName("Sunil")
            .lastName("Kumar")
            .build();

    Candidate candidate2 =
        Candidate.builder()
            .id("id2")
            .firstName("Vishu")
            .middleName("Vardhan")
            .lastName("Prem")
            .build();

    candidateRepository.save(candidate1);
    candidateRepository.save(candidate2);
  }

  @Test
  public void testFindCandidateWithLastName() {
    // 1. Arrange
    String lastName = "Kumar";

    // 2. Act
    List<Candidate> candidateList = candidateRepository.findCandidateWithLastName(lastName);

    // 3. Assert
    assertEquals(1, candidateList.size());
    boolean allLastNamesMatched = candidateList.stream().allMatch(candidate -> candidate.getLastName().equals(lastName));
    assertTrue(allLastNamesMatched);
  }
}
