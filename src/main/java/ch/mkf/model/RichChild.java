package ch.mkf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("rich")
public class RichChild extends Child {

	private String kgGold = "23";

	/**
	 * @return the kgGold
	 */
	public String getKgGold() {
		return kgGold;
	}

	/**
	 * @param kgGold the kgGold to set
	 */
	public void setKgGold(String kgGold) {
		this.kgGold = kgGold;
	}
	
	
}
