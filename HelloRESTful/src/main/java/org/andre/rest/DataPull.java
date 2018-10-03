package org.andre.rest;

import org.andre.util.utils;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/message")
public class DataPull {
 
	@GET
	@Path("setMessage/{param}")
	public Response setMesseg(@PathParam("param") String message) {
 
		JSONObject messageObject = new JSONObject(message);
		utils.organisMessage(messageObject);
 		return Response.status(200).tag("ok").build();
 
	}
	
	@GET
	@Path("/currentMessage")
	public Response getCurrentMesseg() {
		String currentMessage = utils.getCurrentMessage().toString();
 		return Response.status(200).tag(currentMessage).build();
 
	}
}
 
