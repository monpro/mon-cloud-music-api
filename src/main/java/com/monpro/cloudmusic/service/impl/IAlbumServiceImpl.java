package com.monpro.cloudmusic.service.impl;

import com.monpro.cloudmusic.dao.AlbumDao;
import com.monpro.cloudmusic.entity.Album;
import com.monpro.cloudmusic.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAlbumServiceImpl implements IAlbumService {

  private AlbumDao albumDao;

  @Autowired
  public IAlbumServiceImpl(AlbumDao albumDao) {
    this.albumDao = albumDao;
  }

  @Override
  public List<Album> getHomePopularAlbums() {
    return albumDao.findTop10ByOrderByPlayTimesDesc();
  }

  @Override
  public List<Album> getNewReleasedAlbums() {
    return albumDao.findTop10ByOrderByReleaseDateDesc();
  }
}
