package ch.mkf.rest.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.common.collect.ImmutableList;

import ch.mkf.model.PoorChild;
import ch.mkf.model.RichChild;
import ch.mkf.model.Root;
import ch.mkf.model.SimpleClass;

@Path("/test")
public class TestResource {
	
	@GET
	@Path("/simpleClass")
	@Produces({MediaType.APPLICATION_JSON})
	public SimpleClass simpleClass() {
		return new SimpleClass();
	}
	
	@GET
	@Path("/root")
	@Produces({MediaType.APPLICATION_JSON})
	public Root root() {
		Root root = new Root();
		root.setChildren(ImmutableList.of(new PoorChild(), new RichChild()));
		return root;
	}
	
	@POST
	@Path("/rootPost")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Root root(Root root) {
		return root;
	}

}
