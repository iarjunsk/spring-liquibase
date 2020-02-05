package com.arjunsk.liquibase.demo.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "candidate")
public class Candidate {

  @Id
  @Column(name = "candidate_id")
  private String id;

  @Column(name = "candidate_first_name")
  private String firstName;

  @Column(name = "candidate_middle_name")
  private String middleName;

  @Column(name = "candidate_last_name")
  private String lastName;
}
