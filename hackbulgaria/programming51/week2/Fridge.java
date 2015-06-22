package com.hackbulgaria.programming51.week2;

public class Fridge {
	int capacity = 10;
	int count = 0;
	Food[] food = new Food[capacity];
	double weight = 0;
	double foodWeight = 0;

	Fridge() {}
	Fridge(int capacity, double weight) {
		this.capacity = capacity;
		this.weight = weight;
	}


	void addFood(Food f) {
		double weight=foodWeight;
		weight+=f.weight;
		if (weight <= this.weight && count < this.capacity) {
			foodWeight += f.weight;
			food[count] = f;
			count++;
		} else {
			System.out.println("Can't add "+f.getName());
		}
	}

	int getFoodsCount() {
		return this.count;
	}

	public String toString(int i) {
		return null;
	}

	public String[] getProductsOfType(String type) {
		String[] temp = new String[count];
		int cnt = 0;
		for (int i = 0; i < count; ++i) {
			if (type.equals(this.food[i].type)) {
				temp[cnt] = this.food[i].toString();
				cnt++;
			} else
				continue;
		}
		String[] temp1 = new String[cnt];
		for(int i=0;i<cnt;i++){
			temp1[i]=temp[i];
		}
		return temp1;
		
	}

	public int getWeight() {
		return (int) foodWeight;
	}

	public int getMaxWeight() {
		return (int) this.weight;
	}

	public Food getHeaviestFood() {
		Food temp = new Food("", "", 0);
		temp = food[0];
		for (int i = 0; i < count - 1; ++i) {
			if (food[i + 1].weight > food[i].weight) {
				temp = food[i + 1];
			} else
				continue;
		}
		return temp;
	}

	public int getCapacity() {
		return this.capacity;
	}

}
