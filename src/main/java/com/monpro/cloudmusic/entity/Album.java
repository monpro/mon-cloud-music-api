package com.monpro.cloudmusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *
 *
 * <h1>Album class</h1>
 *
 * Created by monpro
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "album")
public class Album {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Integer id;

  @Basic
  @Column(name = "userId", nullable = false)
  private Integer userId;

  @Basic
  @Column(name = "name", nullable = false)
  private String name;

  @Basic
  @Column(name = "releaseDate", columnDefinition = "DATE", nullable = false)
  private LocalDate releaseDate;

  @Basic
  @Column(name = "playTimes", nullable = false)
  private Integer playTimes;

  @Basic
  @Column(name = "contentUrl", nullable = false)
  private String contentUrl;

  @Basic
  @Column(name = "imgUrl", nullable = false)
  private String imgUrl;
}
