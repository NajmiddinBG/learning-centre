package uz.learn.learning_centre;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import uz.learn.learning_centre.property.OpenApiProperties;
import uz.learn.learning_centre.property.ServerProperties;

@SpringBootApplication
@OpenAPIDefinition
@EnableConfigurationProperties(
        {OpenApiProperties.class, ServerProperties.class}
)
@EnableScheduling
public class LearningCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningCentreApplication.class, args);
    }

}
