package com.nitilium.taptask.taptaskweb.pages;

import javax.inject.Inject;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;

import com.beust.jcommander.Parameter;
import com.nitilium.taptask.taptaskweb.components.MaList;

public class Index {

	@Parameter
	@Persist
	private String title;

	@Component
	private MaList maList;

	@Component
	private Form form;
	
	@Property
	private String name;

	void onValidateFromForm() {
		System.out.println("@@@@@@@@@@VALID"+maList.getAge());
		maList.fct(form);
	}

}
