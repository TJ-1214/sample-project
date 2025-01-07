package org.xact.example;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean
public class Greet {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 // Method to handle the form submission
    public String submit() {
        // Do any business logic if needed
        return null; // returning null ensures that the same page is rendered
    }
	
}
