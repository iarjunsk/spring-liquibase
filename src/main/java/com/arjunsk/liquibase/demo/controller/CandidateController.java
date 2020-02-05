package com.arjunsk.liquibase.demo.controller;

import com.arjunsk.liquibase.demo.persistance.entities.Candidate;
import com.arjunsk.liquibase.demo.persistance.respository.CandidateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

  @Autowired CandidateRepository candidateRepository;

  /**
   * Returns the list of all the candidate Entities.
   * @return List<Candidates>
   */
  @GetMapping("/")
  public ResponseEntity<List<Candidate>> getCandidates() {
    return ResponseEntity.ok(candidateRepository.findAll());
  }
}
