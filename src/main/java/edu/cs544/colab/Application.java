package edu.cs544.colab;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import edu.cs544.colab.client.domain.Client;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Grimg on 12/11/2017.
 */

@SpringBootApplication(scanBasePackages ={ "edu.cs544.colab.*"})
@EnableJpaRepositories
@EnableTransactionManagement
@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = {"/","/index"})
    public String home(){
        return "redirect:/ListOffice";
    }

}
