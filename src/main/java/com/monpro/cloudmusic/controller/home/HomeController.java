package com.monpro.cloudmusic.controller.home;

import com.monpro.cloudmusic.entity.Song;
import com.monpro.cloudmusic.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

  private final ISongService songService;

  @Autowired
  public HomeController(ISongService songService) {
    this.songService = songService;
  }

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String index(Long userId) {

    // get today's list
    List<Song> popularSongs = songService.getHomePopularSong(userId);

    return "cloud api setup";
  }
}
