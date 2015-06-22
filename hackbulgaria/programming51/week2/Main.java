package com.hackbulgaria.programming51.week2;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		  Fridge fridge = new Fridge(2,3000);
		    fridge.addFood(new Food("Cheese", "Milk", 300));
		    fridge.addFood(new Food("Milk", "Milk", 1000));
		    fridge.addFood(new Food("Beer", "Bevarage", 500));

		    String[] temp = fridge.getProductsOfType("Milk");
			System.out.println(Arrays.toString(temp));
			System.out.println("getweight "+ fridge.getWeight());
			System.out.println("maxweight "+fridge.getMaxWeight());
			System.out.println("foodsCount "+fridge.getFoodsCount());
			System.out.println("heaviestfood "+fridge.getHeaviestFood());
			System.out.println("fridgecapacity "+fridge.getCapacity());
			
		    
	}

}
