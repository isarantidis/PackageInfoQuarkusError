package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.info1.AccountInfo;

@Path("account")
public class AccountResource {

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Response account( AccountInfo info) {
    	return Response.ok(info).build();
    }
    
    @GET
    public String hello() {
		return "hdi";
    }
}