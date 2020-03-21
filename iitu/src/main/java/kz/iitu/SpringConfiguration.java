package kz.iitu;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.*;
import kz.iitu.EmployeeDTO;


@Configuration
@ComponentScan("kz.iitu")
@PropertySource("file:resources/application.properties")
public class SpringConfiguration {
	@Bean
    public List<EmployeeDTO> EmployeeDTO() {
        List<EmployeeDTO> EmployeeDTO = new ArrayList<>();
        return EmployeeDTO;
    }
}
