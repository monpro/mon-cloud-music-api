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
  private Long id;

  @Basic
  @Column(name = "user_id", nullable = false)
  private Integer userId;

  @Basic
  @Column(name = "name", nullable = false)
  private String name;

  @Basic
  @Column(name = "release_date", columnDefinition = "DATE", nullable = false)
  private LocalDate releaseDate;

  @Basic
  @Column(name = "play_times", nullable = false)
  private Integer playTimes;

  @Basic
  @Column(name = "content_url", nullable = false)
  private String contentUrl;

  @Basic
  @Column(name = "img_url", nullable = false)
  private String imgUrl;
}
