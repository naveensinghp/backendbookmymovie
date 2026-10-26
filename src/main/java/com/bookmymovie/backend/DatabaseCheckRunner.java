package com.bookmymovie.backend;

import com.bookmymovie.backend.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseCheckRunner {

    @Bean
    CommandLineRunner checkDatabase(MovieRepository movieRepository){
      return args -> {
          System.out.println("Database connection: SUCCESS");
          System.out.println("Movie found" + movieRepository.count());
      };
    };
}
