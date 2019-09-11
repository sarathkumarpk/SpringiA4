package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class SlicedXMLConfig {

	@Bean(name="token")
	public Integer getToken() {
		
		return 67;
	}
	
}
