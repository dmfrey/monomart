package mart.mono.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CommerceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceAppApplication.class, args);
    }

}
