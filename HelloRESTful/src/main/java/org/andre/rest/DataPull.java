package org.andre.rest;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import javax.ws.rs.QueryParam;
//import org.json.simple.JSONObject;

import org.andre.util.utils;
import org.json.JSONObject;


@Path("/message")
public class DataPull {
	
	  @POST
	  @Path("/setMessage2")
      @Consumes(MediaType.APPLICATION_JSON)
      public Response setMesseg2(@QueryParam("message") String message) {
		  utils.organisMessage(message);
          return Response.status(200).tag("ok").build();
	 
	      }

	@GET
	@Path("setMessage/{param}")
	public Response setMesseg(@PathParam("param") String message) {
		utils.organisMessage(message);
 		return Response.status(200).tag("ok").build();
 
	}
	
	@GET
	@Path("/currentMessage")
	public String getCurrentMesseg() {
		String currentMessage = utils.getCurrentMessage().toString();
 		return currentMessage;
 
	}
	/*
	  @POST
	  @Path("/send")
      @Consumes(MediaType.APPLICATION_JSON)
      public Response consumeJSON( JSONObject student ) {
              String output = student.toString();
	          return Response.status(200).entity(output).build();
	 
	      }*/
	  
	  

	
	
}
 
