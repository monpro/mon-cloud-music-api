package com.monpro.cloudmusic.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 *
 * <h1>User class</h1>
 *
 * Created by monpro
 */
public class User {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Long id;

  @Basic
  @Column(name = "userName", nullable = false)
  private String userName;

  @Basic
  @Column(name = "password", nullable = false)
  private String password;
}
