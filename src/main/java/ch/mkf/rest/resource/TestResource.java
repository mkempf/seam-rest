package ch.mkf.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import ch.mkf.model.PoorChild;
import ch.mkf.model.RichChild;
import ch.mkf.model.Root;
import ch.mkf.model.SimpleClass;
import ch.mkf.service.TestService;
import ch.mkf.service.TestService2;

import com.google.common.collect.ImmutableList;

@Name("testResource")
@Path("/test")
public class TestResource {
	
	@In(create = true)
	private TestService2 testService2;
	
	@In("#{testService}")
	private TestService testService;
	
	@GET
	@Path("/simpleClass")
	@Produces({MediaType.APPLICATION_JSON})
	public SimpleClass simpleClass() {
		return testService.getSimpleClass();
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
