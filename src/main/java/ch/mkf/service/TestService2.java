package ch.mkf.service;


import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Name;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.mkf.model.SimpleClass;

@Name("testService2")
public class TestService2 {
	
	private static Logger log = LoggerFactory.getLogger(TestService2.class);
	
	
	@Create
	public void init() {
		log.info("TestService2 init");
	}
	
	public SimpleClass getSimpleClass() {
		return new SimpleClass();
	}

}
