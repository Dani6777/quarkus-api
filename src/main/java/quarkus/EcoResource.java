package quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api")
public class EcoResource {
	
	@GET
	@Path("/dias")
	public String saludad() {
		return "Hola Buenos dias";
	}
	

}
