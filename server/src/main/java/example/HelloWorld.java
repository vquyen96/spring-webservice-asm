package example;
import com.sun.net.httpserver.HttpServer;
import entity.Category;
import service.CategoryService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

@WebService()
public class HelloWorld {

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  @WebMethod
  public String createCategory(Category category) {
    String result = "Create new category";
    CategoryService categoryService = new CategoryService();
    return categoryService.register(category);
  }

  public static void main(String[] argv) throws IOException {
    HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getByName("0.0.0.0"), 9000), 16);

    Endpoint fooEndpoint = Endpoint.create(new HelloWorld());
    fooEndpoint.publish(httpServer.createContext("/hello"));

    Endpoint barEndpoint = Endpoint.create(new CategoryService());
    barEndpoint.publish(httpServer.createContext("/category"));
    httpServer.start();
    System.out.println("Ờ!");
  }
}
