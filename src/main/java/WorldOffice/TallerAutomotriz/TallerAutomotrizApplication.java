package WorldOffice.TallerAutomotriz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class TallerAutomotrizApplication {


	public static void main(String[] args) {
		SpringApplication.run(TallerAutomotrizApplication.class, args);
	}

}
