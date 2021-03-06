package openpulse.sppabe.contentmanagementapi;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ContentManagementApiApplication {

	public static void main(String[] args) {
        // log4j enable
        BasicConfigurator.configure();

		SpringApplication.run(ContentManagementApiApplication.class, args);
	}
}
