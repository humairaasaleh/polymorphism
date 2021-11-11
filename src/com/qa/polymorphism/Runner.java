package com.qa.polymorphism;

public class Runner {

	public static void main(String[] args) {

		England england = new England();
		System.out.println("----------ENGLAND--------");
		england.language();
		england.capital();
		
		France france = new France();
		System.out.println("--------FRANCE-------");
		france.language();
		france.capital();

		Countries countriesengland = new England();
		Countries countriesfrance = new France();
		System.out.println("--------COUNTRIES----------");
		((England) countriesengland).country();
		((France) countriesfrance).country();
		

		Object objectEngland = new England();
		System.out.println("----------OBJECT-----------");
		((Countries) objectEngland).capital();
		((England) objectEngland).language();

	}

}
