package edu.cs544.colab;

import edu.cs544.colab.office.dao.OfficeDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by Grimg on 12/11/2017.
 */
@SpringBootApplication(scanBasePackages = {"edu.cs544.colab.*"})
@EnableJpaRepositories
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
