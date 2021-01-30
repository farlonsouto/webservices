package org.farlon.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SimpleWebService {

  private static final String message = "Your message is: %s";

  @WebMethod
  public String saySomething(String SimpleServer) {
    return String.format(message, SimpleServer);
  }
}
