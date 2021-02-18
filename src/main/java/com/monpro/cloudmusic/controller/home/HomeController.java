package com.monpro.cloudmusic.controller.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String index() {

    // get recommendation

    // get today's list

    // get ads

    return "cloud api setup";
  }
}
