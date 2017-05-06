package com.hotel.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hotel.model.Cliente;
import com.hotel.service.ClientRegistration;

@Path("/cliente")
@RequestScoped
public class ClienteService {
	
	@Inject
	private ClientRegistration cliente;
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listaClientes(){
				
		return cliente.todosOsClientes();
	}
	
	@GET
	@Path("/{cpf:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public String consultaCliente(@PathParam("cpf")int cpf) {
        return "Cliente Cliente "+ cpf;
    }

	@POST
	@Path("/{cpf:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public String incluiCliente(@PathParam("cpf")int cpf) {
		//objeto nao tem id do cliente
        return "Cliente Cliente "+ cpf;
    }
	
	@POST
	@Path("/{cpf:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public String alteraCliente(@PathParam("cpf")int cpf) {
		//objeto tem id do cliente
        return "Cliente Cliente "+ cpf;
    }
	
}
