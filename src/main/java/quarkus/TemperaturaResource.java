package quarkus;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temperaturas")
public class TemperaturaResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listado")
	public List<Temperatura> list(){
		return Arrays.asList(
				new Temperatura("Malaga", 18, 28),
				new Temperatura("Santiago", 23, 32),
				new Temperatura("La Serena", 18, 19)	
				);
	}
	
	@GET
	@Path("/ciudad")
	@Produces(MediaType.APPLICATION_JSON)
	public Temperatura medicion() {
		 return new Temperatura("Santiago", 18, 28);
	}
}
