package com.monpro.cloudmusic.controller.home;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerTest {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String index() {
    return "cloud api setup";
  }
}
