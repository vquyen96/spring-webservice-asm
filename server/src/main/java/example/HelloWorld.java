package example;
import com.sun.net.httpserver.HttpServer;
import entity.Category;
import entity.Place;
import entity.User;
import service.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

@WebService()
public class HelloWorld {

  private SignUpService signUpService;
  private SignInService signInService;
  private CategoryService categoryService;
  private PlaceService placeService;

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

  @WebMethod
  public void login(String username, String password) {
    signInService.login(username, password);
  }

  @WebMethod
  public void createCategory(Category category) {
    categoryService.save(category);
  }

  @WebMethod
  public List<Category> categories(){
    return categoryService.findAll();
  }

  @WebMethod
  public void createPlace(Place place) {
    placeService.save(place);
  }

  public static void main(String[] argv) throws IOException {
    HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getByName("0.0.0.0"), 9000), 16);

    Endpoint fooEndpoint = Endpoint.create(new HelloWorld());
    fooEndpoint.publish(httpServer.createContext("/hello"));

    Endpoint signinEndpoint = Endpoint.create(new SignInService());
    signinEndpoint.publish(httpServer.createContext("/login"));

    Endpoint signupEndpoint = Endpoint.create(new SignUpService());
    signupEndpoint.publish(httpServer.createContext("/register"));

    Endpoint categoryEndpoint = Endpoint.create(new CategoryService());
    categoryEndpoint.publish(httpServer.createContext("/category"));

    Endpoint placeService = Endpoint.create(new PlaceService());
    placeService.publish(httpServer.createContext("/place"));

    Endpoint ratePlaceService = Endpoint.create(new RatePlaceService());
    ratePlaceService.publish(httpServer.createContext("/rate/place"));

    httpServer.start();
    System.out.println("Service started!");
  }
}

