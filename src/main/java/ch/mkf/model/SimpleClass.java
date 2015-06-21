package ch.mkf.model;

import org.joda.time.LocalDate;

public class SimpleClass {
	
	private String simpleString;
	private LocalDate date = LocalDate.now();
	private java.time.LocalDate javaDate = java.time.LocalDate.now();

	/**
	 * @return the simpleString
	 */
	public String getSimpleString() {
		return simpleString;
	}

	/**
	 * @param simpleString the simpleString to set
	 */
	public void setSimpleString(String simpleString) {
		this.simpleString = simpleString;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the javaDate
	 */
	public java.time.LocalDate getJavaDate() {
		return javaDate;
	}

	/**
	 * @param javaDate the javaDate to set
	 */
	public void setJavaDate(java.time.LocalDate javaDate) {
		this.javaDate = javaDate;
	}
	
}
