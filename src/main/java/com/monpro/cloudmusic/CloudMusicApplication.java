package com.monpro.cloudmusic;

import com.monpro.cloudmusic.dao.SongDao;
import com.monpro.cloudmusic.entity.Song;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudMusicApplication {

  private static final Logger logger = LoggerFactory.getLogger(CloudMusicApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CloudMusicApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(SongDao songDao) {
    return (args) -> {
      songDao.save(new Song(1l, "my heart will go one", 55, "", ""));
      songDao.save(new Song(2l, "good time", 66, "", ""));
      songDao.save(new Song(3l, "sing", 77, "", ""));
      songDao.save(new Song(4l, "feel it still", 88, "", ""));
      songDao.save(new Song(5l, "sunny day", 99, "", ""));
      logger.info("find all songs by calling songDao.findAll()");
      for (Song song : songDao.findAll()) {
        logger.info(song.toString());
      }
      logger.info("");
      logger.info("find song with givenId songDao.findById()");
      logger.info(songDao.findById(2l).toString());

      for (Song song : songDao.findTop5ByOrderByPlayTimesDesc()) {
        logger.info(song.toString());
      }
    };
  }
}
