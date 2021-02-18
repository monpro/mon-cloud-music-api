package com.monpro.cloudmusic.service.impl;

import com.monpro.cloudmusic.entity.Song;
import com.monpro.cloudmusic.service.ISongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISongServiceImpl implements ISongService {

  @Override
  public List<Song> getHomePopularSong(Long userId) {

    return null;
  }
}
