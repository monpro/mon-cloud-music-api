package com.monpro.cloudmusic.controller.home;

import com.monpro.cloudmusic.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final ISongService songService;

  @Autowired
  public HomeController(ISongService songService) {
    this.songService = songService;
  }

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public Object index(Long userId) {

    // get today's list
    return songService.getHomePopularSong();
  }
}
