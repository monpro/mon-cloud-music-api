package com.monpro.cloudmusic.service;

import com.monpro.cloudmusic.entity.Song;

import java.util.List;

public interface ISongService {
  /**
   * @param
   * @return popular songs at home page for this user Should produced from recommendation system
   */
  List<Song> getHomePopularSong();
}
