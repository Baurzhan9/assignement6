package kz.iitu;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "kz.iitu")
@PropertySource("application.properties")
public class SpringConfiguration {

}
