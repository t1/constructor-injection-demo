package demo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demo")
public class Boundary {
    @Inject Bar bar;

    @GET public String get() { return bar.get(); }
}
