package com.monpro.cloudmusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
  @Column(name = "playTimes", nullable = false)
  private Integer playTimes;

  @Basic
  @Column(name = "imgUrl", nullable = false)
  private String imgUrl;

  @Basic
  @Column(name = "musicUrl", nullable = false)
  private String musicUrl;

  @Override
  public String toString() {
    return "Song{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", playTimes=" + playTimes +
            ", imgUrl='" + imgUrl + '\'' +
            ", musicUrl='" + musicUrl + '\'' +
            '}';
  }
}
