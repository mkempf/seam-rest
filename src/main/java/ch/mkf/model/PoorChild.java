package ch.mkf.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("poor")
public class PoorChild extends Child {

	private String kgStones = "23";

	/**
	 * @return the kgStones
	 */
	public String getKgStones() {
		return kgStones;
	}

	/**
	 * @param kgStones the kgStones to set
	 */
	public void setKgStones(String kgStones) {
		this.kgStones = kgStones;
	}
}
