package org.farlon.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
@Produces({MediaType.TEXT_HTML})
public class SimpleWebService {

  private static final String html =
      "<html> "
          + "<title>"
          + "Java WebService Example"
          + "</title>"
          + "<body><h1><div style='font-size: larger;'>"
          + "Hello <span style='text-transform: capitalize; color: green;'> %s </span></div></h1></body>"
          + "</html>";

  @GET
  public Response handleMessage() {
    return Response.status(200).entity(String.format(html, "OK")).build();
  }
}
