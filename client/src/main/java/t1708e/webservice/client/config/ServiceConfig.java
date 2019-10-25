package t1708e.webservice.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.webservice.client.service.*;

import javax.xml.rpc.ServiceException;

@Configuration
public class ServiceConfig {

    @Bean
    SignInService signInService() throws ServiceException {
        SignInServiceServiceLocator locator = new SignInServiceServiceLocator();
        SignInService signInService = locator.getSignInServicePort();
        return signInService;
    }

    @Bean
    SignUpService signUpService() throws ServiceException {
        SignUpServiceServiceLocator  locator = new SignUpServiceServiceLocator();
        SignUpService signUpService = locator.getSignUpServicePort();
        return signUpService;
    }

    @Bean
    CategoryService categoryService() throws ServiceException {
        CategoryServiceServiceLocator  locator = new CategoryServiceServiceLocator();
        CategoryService categoryService = locator.getCategoryServicePort();
        return categoryService;
    }

    @Bean
    PlaceService placeService() throws ServiceException {
        PlaceServiceServiceLocator  locator = new PlaceServiceServiceLocator();
        PlaceService placeService = locator.getPlaceServicePort();
        return placeService;
    }
}
