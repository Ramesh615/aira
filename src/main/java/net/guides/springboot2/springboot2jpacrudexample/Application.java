package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args); 
	}
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(Application.class);
  }
}
