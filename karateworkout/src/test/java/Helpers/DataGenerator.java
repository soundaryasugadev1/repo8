package Helpers;

import com.github.javafaker.Faker;

public class DataGenerator{
	public static String getRandomname() {
		Faker faker = new Faker();
		String name = faker.name().title().toUpperCase();
	 return name;
		
	}
	
}