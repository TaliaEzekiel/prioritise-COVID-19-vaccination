// YourSpringBootApplication.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example")
public class YourSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(YourSpringBootApplication.class, args);
    }
}
