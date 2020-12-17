package telran.propets.zuul;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulTestApplication {
	
	@Autowired
	static
	WakeUpService service;

	public static void main(String[] args) throws URISyntaxException {
		SpringApplication.run(ZuulTestApplication.class, args);
		service.wakeUp();
	}

}
