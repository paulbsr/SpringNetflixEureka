package ie.bester.netflixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaServerApplication.class, args);
		System.out.println("Welcome to the Springbok Hall of Fame, Dr. Mary Giblin. This is your Netflix Eureka Service running on port:8765");
		
	}

}
