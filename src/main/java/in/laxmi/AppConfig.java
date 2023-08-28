package in.laxmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"in.laxmi","com.tcs"})
public class AppConfig {
public AppConfig() {
	System.out.println("appConfig :: constructor");
}
@Bean
public Engine getEngine() {
	Engine eng = new Engine();
	return eng;
}
}
