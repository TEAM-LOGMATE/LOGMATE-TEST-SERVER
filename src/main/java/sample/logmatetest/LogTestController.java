package sample.logmatetest;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class LogTestController {

  @Value("${spring.application.name}")
  private String name;

  @GetMapping
  public void testLog() throws InterruptedException {
    while (true) {
      Thread.sleep(3000);
      log.info("INFO 로그입니다. application name: {}" , name);
      log.warn("WARN 로그입니다.application name: {}" , name);
      log.error("ERROR 로그입니다.application name: {}" , name);
    }
  }

}
