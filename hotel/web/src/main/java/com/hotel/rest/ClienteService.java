package com.hotel.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cliente/{cpf:[0-9][0-9]*}")
@RequestScoped
public class ClienteService {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ConsultaCliente(@PathParam("cpf")int cpf) {
        return "Cliente Cliente "+ cpf;
    }

}
