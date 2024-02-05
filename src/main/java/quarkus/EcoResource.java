package quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/api")
public class EcoResource {
	
	@GET
	@Path("/saludar")
	public String saludad(@QueryParam("mensaje")String mensaje) {
		if(mensaje == null) {
			return"no hay nada";
		}
		return "> " + mensaje;
	}
	
	@GET
	@Path("/{nombre}")
	public String saludo(@PathParam("nombre")String nombre) {
		return "Hola " + nombre;
	}

}
