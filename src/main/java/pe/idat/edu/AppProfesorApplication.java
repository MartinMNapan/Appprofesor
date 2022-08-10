package pe.idat.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class AppProfesorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppProfesorApplication.class, args);
	}

}
