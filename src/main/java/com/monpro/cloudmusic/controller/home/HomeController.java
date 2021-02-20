package com.monpro.cloudmusic.controller.home;

import com.monpro.cloudmusic.CloudMusicApplication;
import com.monpro.cloudmusic.entity.Album;
import com.monpro.cloudmusic.entity.Song;
import com.monpro.cloudmusic.service.IAlbumService;
import com.monpro.cloudmusic.service.ISongService;
import com.monpro.cloudmusic.vo.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

  private final ISongService songService;

  private final IAlbumService albumService;

  private static final Logger logger = LoggerFactory.getLogger(CloudMusicApplication.class);

  @Autowired
  public HomeController(ISongService songService, IAlbumService albumService) {
    this.songService = songService;
    this.albumService = albumService;
  }

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  @ResponseBody
  public Object index(Long userId) {

    // get today's list
    try {
      Map<String, List> result = new HashMap<>();
      List<Song> popularSongs = songService.getHomePopularSong();
      List<Song> newAddedSongs = songService.getNewAddedSong();
      List<Album> popularAlbums = albumService.getHomePopularAlbums();
      List<Album> newReleasedAlbums = albumService.getNewReleasedAlbums();
      result.put("popularSongs", popularSongs);
      result.put("newAddedSongs", newAddedSongs);
      result.put("popularAlbums", popularAlbums);
      result.put("newReleasedAlbums", newReleasedAlbums);

      return Response.success(result);
    } catch (Exception e) {
      logger.error(e.toString());
      throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
