package itc.com.flyDubbaiDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//@ComponentScan("itc.com.*")
@ComponentScan(basePackages = "itc.com.*") 
@EnableJpaRepositories("itc.com.repository")
public class FlyDubbaiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyDubbaiDemoApplication.class, args);
	}
}
