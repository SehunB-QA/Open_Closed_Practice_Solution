package com.qa.open_closed_practice;

public abstract class Greeter {
	
	private String greetingType;

    public abstract String greet();
       
    

    public void setGreetingType(String greetingType) {
        this.greetingType = greetingType;
    }



	@Override
	public String toString() {
		return "Greeter [greetingType=" + greetingType + "]";
	}



	public String getGreetingType() {
		return greetingType;
	}

}
