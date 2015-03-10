import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@EnableEurekaClient
@Configuration
public class Example {
    @Value("${eureka.instance.metadataMap.instanceId}")
    private String value;

    @RequestMapping("/")
    public String home() {
        return "Hello World from "+value+" !";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}