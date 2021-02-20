package com.monpro.cloudmusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "song")
public class Song {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Long id;

  @Basic
  @Column(name = "name", nullable = false)
  private String name;

  @Basic
  @Column(name = "play_times", nullable = false)
  private Integer playTimes;

  @Basic
  @Column(name = "img_url", nullable = false)
  private String imgUrl;

  @Basic
  @Column(name = "music_url", nullable = false)
  private String musicUrl;

  @Basic
  @Column(name = "add_date", columnDefinition = "DATE", nullable = false)
  private LocalDate addDate;

  @Override
  public String toString() {
    return "Song{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", playTimes="
        + playTimes
        + ", imgUrl='"
        + imgUrl
        + '\''
        + ", musicUrl='"
        + musicUrl
        + '\''
        + ", addDate="
        + addDate
        + '}';
  }
}
