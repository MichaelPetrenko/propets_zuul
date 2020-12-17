package telran.propets.zuul;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WakeUpService implements IWakeUpService{
	
	@Autowired
	RestTemplate restTemplate;
	
	String[] uris = {
			"http://propets-me.herokuapp.com/wakeup",//D
			"http://propets-lfs.herokuapp.com/wakeup",//D
			"http://propets-mes.herokuapp.com/wakeup",//D
			"http://propets-fav.herokuapp.com/wakeup",//D
			"http://propets-disp.herokuapp.com/wakeup",//D
			"http://propets-token.herokuapp.com/wakeup"//D
			};

	@Override
	public void wakeUp() throws URISyntaxException {
		for(int i=0 ; i<uris.length; i++) {
			URI uri = new URI(uris[i]);
			ResponseEntity<Void> responce = restTemplate.exchange(uri, HttpMethod.GET, HttpEntity.EMPTY, Void.class);
			System.out.println("================= "+responce.getStatusCodeValue());
		}
//		ResponseEntity<Void> responce = restTemplate.exchange(uri, HttpMethod.GET, Void.class);
	}
}
