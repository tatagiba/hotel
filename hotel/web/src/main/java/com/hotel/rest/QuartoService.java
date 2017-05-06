package com.hotel.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quarto/{quarto:[0-9][0-9]*}")
@RequestScoped
public class QuartoService {
	

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ConsultaQuarto(@PathParam("quarto")int quarto) {
        return "Quarto Cliente "+ quarto;
    }
	

	@POST
    @Produces(MediaType.APPLICATION_JSON)
    public String CadastraQuarto(@PathParam("quarto")int quarto) {
        return "Cliente Cliente "+ quarto;
    }
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    public String AlteraQuarto(@PathParam("quarto")int quarto) {
        return "Cliente Cliente "+ quarto;
    }
	
	@DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String DeletaQuarto(@PathParam("quarto")int quarto) {
        return "Cliente Cliente "+ quarto;
    }

}
