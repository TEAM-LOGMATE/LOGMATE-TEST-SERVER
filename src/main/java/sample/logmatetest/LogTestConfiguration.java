package sample.logmatetest;

import com.logmate.LogMateInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTestConfiguration {

  @Bean
  public LogMateInitializer logMateConfiguration() {
    return new LogMateInitializer("logs/application.log", "http://localhost:8083/logs/spring/abcde");
  }
}
