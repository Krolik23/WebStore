package com.webstoresite;

import com.webstoresite.domain.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ProductRepository.class)
public class WebStoreSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreSiteApplication.class, args);
	}
}
