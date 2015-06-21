package ch.mkf.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = As.WRAPPER_OBJECT)
@JsonSubTypes({
	@Type(RichChild.class), 
	@Type(PoorChild.class)
})
public abstract class Child {
	
	int primType = 21;

	/**
	 * @return the primType
	 */
	public int getPrimType() {
		return primType;
	}

	/**
	 * @param primType the primType to set
	 */
	public void setPrimType(int primType) {
		this.primType = primType;
	}
}
