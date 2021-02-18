package com.monpro.cloudmusic.service.impl;

import com.monpro.cloudmusic.dao.SongDao;
import com.monpro.cloudmusic.entity.Song;
import com.monpro.cloudmusic.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISongServiceImpl implements ISongService {

  private final SongDao songDao;

  @Autowired
  public ISongServiceImpl(SongDao songDao) {
    this.songDao = songDao;
  }

  @Override
  public List<Song> getHomePopularSong() {
    return songDao.findTop5ByOrderByPlayTimesDesc();
  }
}
