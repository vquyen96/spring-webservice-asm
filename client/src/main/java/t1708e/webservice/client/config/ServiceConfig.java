package t1708e.webservice.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.webservice.client.service.SignUpService;
import t1708e.webservice.client.service.SignUpServiceServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class ServiceConfig {

    @Bean
    SignUpService signUpService() throws ServiceException {
        SignUpServiceServiceLocator  locator = new SignUpServiceServiceLocator();
        SignUpService signUpService = locator.getSignUpServicePort();
        return signUpService;
    }
}
