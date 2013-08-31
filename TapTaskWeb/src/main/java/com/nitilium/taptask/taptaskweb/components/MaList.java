package com.nitilium.taptask.taptaskweb.components;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;

public class MaList {

	
	private String age;

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	public void fct(Form form) {
		System.out.println("@@@@@@@@@@@@");
		form.recordError("MON ERREUR");
	}
	
}
