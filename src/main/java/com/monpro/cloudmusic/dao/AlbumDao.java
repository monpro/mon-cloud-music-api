package com.monpro.cloudmusic.dao;

import com.monpro.cloudmusic.entity.Album;
import com.monpro.cloudmusic.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumDao extends JpaRepository<Album, Long> {

    List<Album> findTop10ByOrderByPlayTimesDesc();

    List<Album> findTop10ByOrderByReleaseDateDesc();

}
