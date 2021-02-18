package com.monpro.cloudmusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 *
 * <h1>Player class</h1>
 *
 * Created by monpro
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player")
public class Artist {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Long id;

  @Basic
  @Column(name = "name", nullable = false)
  private String name;

  @Basic
  @Column(name = "desc", nullable = false)
  private String desc;

  @Basic
  @Column(name = "gender", nullable = false)
  private Gender gender;

  @Basic
  @Column(name = "bornDate", columnDefinition = "DATE", nullable = false)
  private LocalDate bornDate;

  @Basic
  @Column(name = "imgUrl", nullable = false)
  private String imgUrl;

  @Basic
  @Column(name = "likes", nullable = false)
  private Integer likes;
}
