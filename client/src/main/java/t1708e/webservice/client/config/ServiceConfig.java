package t1708e.webservice.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.serviceclient.service.StudentService;
import t1708e.serviceclient.service.StudentServiceServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class ServiceConfig {

    @Bean
    Ca studentService() throws ServiceException {
        StudentServiceServiceLocator locator = new StudentServiceServiceLocator();
        StudentService studentService = locator.getStudentServicePort();
        return studentService;
    }
}
