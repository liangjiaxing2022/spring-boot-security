package cn.sd.security;

import com.sun.org.apache.xerces.internal.parsers.SecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.sd")
public class DemoApplication {
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
