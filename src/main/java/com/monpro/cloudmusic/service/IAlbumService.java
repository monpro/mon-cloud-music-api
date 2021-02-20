package com.monpro.cloudmusic.service;

import com.monpro.cloudmusic.entity.Album;

import java.util.List;

public interface IAlbumService {

  List<Album> getHomePopularAlbums();

  List<Album> getNewReleasedAlbums();
}
