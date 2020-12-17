package telran.propets.zuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulTestApplication.class, args);
	}

}
