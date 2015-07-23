package com.hackbulgaria.programming51.week6;

public class ToShoot extends Weapon {

	public ToShoot(int damage, int durability) {
		super(damage, durability);
		// TODO Auto-generated constructor stub
	}

	public void hit() {
		if (durability > 0) {
			durability--;
		}
		if (durability == 0) {
			damage = 1;
		}
	}

	public String getType() {
		// TODO Auto-generated method stub
		return "TO_SHOOT";
	}
}
