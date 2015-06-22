package com.hackbulgaria.programming51.week2;

public class Food {
	public String name;
	public String type; // - "Milk", "Sweet", "Vegetable", "Fruit", "Bevarage"
	public double weight;// - in grams

	Food(String name, String type, double weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String toString() {
		String string4e;
		string4e = getName() + " - " + getType() + ": " + getWeight() + "grams";
		return string4e;
	}

	String getName() {
		return name;
	};

	String getType() {
		return type;
	};

	double getWeight() {
		return weight;
	};

	void setName(String name) {
		this.name = name;
	};

	void setType(String type) {
		this.type = type;
	};

	void setWeight(double weight) {
		this.weight = weight;
	};
}
