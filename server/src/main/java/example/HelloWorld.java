package example;
import com.sun.net.httpserver.HttpServer;
import entity.User;
import service.CategoryService;
import service.SignInService;
import service.SignUpService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

@WebService()
public class HelloWorld {

  private SignUpService signUpService;

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  @WebMethod
  public void register(User user) {
    signUpService.create(user);
  }

  public static void main(String[] argv) throws IOException {
    HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getByName("0.0.0.0"), 9000), 16);

    Endpoint fooEndpoint = Endpoint.create(new HelloWorld());
    fooEndpoint.publish(httpServer.createContext("/hello"));

    Endpoint signinEndpoint = Endpoint.create(new SignInService());
    signinEndpoint.publish(httpServer.createContext("/login"));

    Endpoint signupEndpoint = Endpoint.create(new SignInService());
    signupEndpoint.publish(httpServer.createContext("/register"));

    Endpoint categoryEndpoint = Endpoint.create(new CategoryService());
    categoryEndpoint.publish(httpServer.createContext("/category"));

    httpServer.start();
    System.out.println("Ờ!");
  }
}
