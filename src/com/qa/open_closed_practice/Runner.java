package com.qa.open_closed_practice;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting normalGreet = new Greeting();
		FormalGreeting fg = new FormalGreeting();
		CasualGreeting cg = new CasualGreeting();
		
		System.out.println(fg.greet());
		System.out.println(normalGreet.greet());
		System.out.println(cg.greet());
	}

}
