package com.monpro.cloudmusic.dao;

import com.monpro.cloudmusic.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongDao extends JpaRepository<Song, Long> {

  List<Song> findTop5ByOrderByPlayTimesDesc();

  List<Song> findTop10ByOrderByAddDateDesc();
}
