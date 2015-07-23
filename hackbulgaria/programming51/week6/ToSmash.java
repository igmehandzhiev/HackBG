package com.hackbulgaria.programming51.week6;

public class ToSmash extends Weapon {

	public ToSmash(int damage, int durability) {
		super(damage, durability);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return "TO_SMASH";
	}

	public void hit() {
		// TODO Auto-generated method stub
		if (durability > 0)
			durability--;
		if (durability < maxDurability / 2 && damage > 1) {
			damage--;
		}
	}
}
