package ch.mkf.service;

import org.springframework.stereotype.Component;

import ch.mkf.model.SimpleClass;

@Component
public class TestService {
	
	public SimpleClass getSimpleClass() {
		return new SimpleClass();
	}

}
