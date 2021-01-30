package org.farlon.webservice;

import javafx.util.Duration;
import javax.xml.ws.Endpoint;

public class SimpleServer {

  protected SimpleServer() throws Exception {
    System.out.println("Starting Server...");
    Object implementor = new SimpleWebService();
    String address = "http://localhost:9090/farlon";
    Endpoint.publish(address, implementor);
  }

  public static void main(String args[]) throws Exception {
    new SimpleServer();
    System.out.println("Server up!");

    Thread.sleep((long) Duration.minutes(30).toMillis());
    System.out.println("Server exiting...");
    System.exit(0);
  }
}
